package xyz;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String day=s.nextLine().toLowerCase();
        switch (day) {
		case "monday": {
			
			System.out.println("lets learn java");
			break;
		}
      case "tuesday": {
			
			System.out.println("lets learn python");
			break;
		}
      case "wednesday": {
			
			System.out.println("lets learn ruby");
			break;
		}
      case "thrusday": {
			
			System.out.println("lets learn springboot");
			break;
		}
      case "friday": {
			
			System.out.println("lets learn c++");
			break;
		}
      case "saturday": {
			
			System.out.println("lets learn daa");
			break;
		}
      case "sunday": {
			
			System.out.println("lets learn dbms");
			break;
		}
		default:
			
			break;
		}
        s.close();
	}

}
