package xyz;

import java.util.Scanner;

public class CoreJavaTaskWithStrings {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();	
        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println(s1);
        if (s1.equals(s)) {
            System.out.println("yes");
        } else {
            System.out.println("not palindrome");
        }
    }
}
