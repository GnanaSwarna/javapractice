package xyz;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 int result=a[0];
	 for(int i=0;i<n;i++) {
		  a[i]=sc.nextInt();
	 }
	 for(int j=0;j<n;j++) {
		 
		 if(a[j]>result) {
			result=a[j]; 
		 }
	 }
     System.out.println(result);
     sc.close();
	}

}
