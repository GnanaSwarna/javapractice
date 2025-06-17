package xyz;
class Animal{
	void eat() {
		System.out.println("eating");
	}
	void sleep() {
		System.out.println("sleeping");
	}
}
class dog extends Animal{
	void sound() {
		System.out.println("bow bow");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("meow meow");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         dog ob1=new dog();
         cat ob2=new cat();
         ob1.eat();
         ob1.sleep();
         ob1.sound();
         ob2.eat();
         ob2.sleep();
         ob2.sound();
	}

}
