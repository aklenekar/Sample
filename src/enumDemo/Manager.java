package enumDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {

	private static Map<Channel, Map<Channel, List<Clone>>> mapper = new HashMap<>();

	static {
		addClone(Channel.DISPLAY);
		addClone(Channel.DISPLAY, Channel.VIDEO , new Name());
		
		addClone(Channel.VIDEO);
		addClone(Channel.VIDEO, Channel.AUDIO , new Date());
		
		addClone(Channel.UNKNOWN);
	}
	
	private static void addClone(Channel original) {
		mapper.put(original, new HashMap<>());
	}
	
	private static void addClone(Channel original, Channel channel, Clone... clones) {
		Map<Channel, List<Clone>> methods = mapper.get(original);
		methods.put(channel, Arrays.asList(clones));
		mapper.put(original, methods);
	}

	private static class Name implements Clone {
		@Override
		public void clone(User original, User cloned) {
			cloned.setName(original.getName() + "_copy");
		}
	}

	private static class Date implements Clone {
		@Override
		public void clone(User original, User cloned) {
			cloned.setDate(original.getDate().plusDays(3));
		}
	}
	
	public static User cloneUser(User original, Channel oChannel, Channel cChannel) {
		
		User clUser = new User();
		clUser.setId(original.getId() + 1);
		
		mapper.get(oChannel).get(cChannel)
		.forEach(clone -> clone.clone(original, clUser));
		
		return clUser;
	}
}
