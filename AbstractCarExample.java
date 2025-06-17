package xyz;

import java.util.Scanner;

abstract class Example{
	abstract void car();
}
 class car2 extends Example{
	void car() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Driving a car");
			System.out.println("1.start car");
			System.out.println("2.turn left");
			System.out.println("3.turn right");
			System.out.println("4.stop the car");
			int n=sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("started");
			}
			case 2: {
				System.out.println("started");
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}
	}
}
public class AbstractCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
