package enumDemo;

import java.time.LocalDateTime;

public class Testing {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setDate(LocalDateTime.now());
		user1.setName("ABC");
		
		System.out.println(user1 + "\n");
		System.out.println(Manager.cloneUser(user1, Channel.DISPLAY, Channel.VIDEO));
		
		User user2 = new User();
		user2.setId(3);
		user2.setDate(LocalDateTime.now().plusMonths(5));
		user2.setName("XYZ");
		
		System.out.println("\n"+ user2 + "\n");
		System.out.println(Manager.cloneUser(user2, Channel.VIDEO, Channel.AUDIO));
		
		User user3 = new User();
		user3.setId(5);
		user3.setDate(LocalDateTime.now().plusMonths(5));
		user3.setName("PQR");
		
		System.out.println("\n"+ user3 + "\n");
		System.out.println(Manager.cloneUser(user3, Channel.VIDEO, Channel.AUDIO));
	}
}
