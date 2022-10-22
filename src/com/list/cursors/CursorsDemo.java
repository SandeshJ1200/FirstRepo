package com.list.cursors;

import java.util.*;

public class CursorsDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		System.out.println(al);
	
		ListIterator itr = al.listIterator();
//		to move pointer to the last position
		while(itr.hasNext()) {
			itr.next();
		}
		
//		to iterate in reverse
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
			
	}

}
