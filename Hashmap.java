package xyz;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> students=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println("enter the name");
		 for (int i=0;i<=5;i++){
			 int n=sc.nextInt();
			 String name= sc.nextLine();
			 students.put(n,name);
		 }
		 System.out.println(students);

	}

}
