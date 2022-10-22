package com.list.arraylistdemo;

import java.util.*;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al);
		
		al2.add("5");
		al2.add("6");
		System.out.println(al2);
		
		
//		parameter: int index, collection c
		al.add(1, al2); 
//		System.out.println(al);
//		output = [1, [5, 6], 2, 3, 4]
		
//		Object o = al.get(1);
		
		System.out.println(((ArrayList)al.get(1)).get(0));
		
		
//		parameter: int index, collection c
//		al.addAll(1, al2);
//		System.out.println(al);
//		output = [1, 5, 6, 2, 3, 4]
		
//		parameter: collection c
//		al.addAll(al2);
//		System.out.println(al);
//		output = [1, 2, 3, 4, 5, 6]
		
//		al = new ArrayList (al2);
//		System.out.println(al);
	}

}
