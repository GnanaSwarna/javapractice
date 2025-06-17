package xyz;

import java.util.Scanner;

public class RainUmberlla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean isRaining=sc.nextBoolean();
		if(isRaining) {
			System.out.println("Take an Umbrella");
		}else {
			System.out.println("no need of umbrella");
		}
sc.close();
	}

}
