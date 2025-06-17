package xyz;

public interface Printable {
	void print();
}
class Message implements Printable{
	public void print() {
		System.out.println("the interface is given");
	}
 public class abc{
	 public static void main(String[] args) {
		 Message obj=new Message();
		 obj.print();
	 }
 }
}
