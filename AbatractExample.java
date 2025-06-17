package xyz;
abstract class Examp{
	abstract void car();
}
class AC extends Examp{
	void car() {
		System.out.println("license");
	}
}
class BC extends Examp{
	void car() {
		System.out.println("Driving");
	}
}
public class AbatractExample {

	public static void main(String[] args) {
           Examp obj=new BC();
           Examp objj=new AC();
		obj.car();
		objj.car();
	}

}
