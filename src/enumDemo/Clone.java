package enumDemo;

@FunctionalInterface
public interface Clone {

	abstract void clone(User original, User cloned);
}
