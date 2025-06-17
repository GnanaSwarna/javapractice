package xyz;

public interface message {
	void say();
}
 class demolambda{
	public static void main(String[] args) {
		message hellomessage = () -> System.out.println("this is lambda program");
		hellomessage.say();
	}
}
