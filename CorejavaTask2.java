package xyz;

import java.util.Scanner;

public class CorejavaTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		int rem;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n;
		while(n!=0) {
			 rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(m==reverse) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
       
	}

}
