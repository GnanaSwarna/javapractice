package xyz;

import java.util.ArrayList;

public class ArrayListTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cartoon=new ArrayList<>();
		cartoon.add("shinchan");
		cartoon.add("dora");
		cartoon.add("tom jerry");
		cartoon.add("dragon booster");
		cartoon.add("mickey mouse");
		System.out.println(cartoon);
		System.out.println(cartoon.remove("dora"));
		for(int i=0;i<cartoon.size();i++) {
			System.out.println(cartoon.get(i));
		}
		cartoon.add(1, "tom");
		System.out.println(cartoon);
		cartoon.set(1, "man");
		System.out.println(cartoon);
	}


}
