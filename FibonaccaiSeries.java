package xyz;

import java.util.Scanner;

class Recursion1{
	int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
		
	}
}
public class FibonaccaiSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
	     Recursion1 obj=new Recursion1();
	     for(int j=0;j<=h;j++) {
	    	System.out.println(""+ obj.fibo(j)); 
	     }
	    

	}

}
