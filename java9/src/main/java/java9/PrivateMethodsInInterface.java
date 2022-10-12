package java9;

public interface PrivateMethodsInInterface {
	private void somePrivate() {
		System.out.println("I'm a private method");
	}

	default void usingPrivate() {
		somePrivate();
	}
}
