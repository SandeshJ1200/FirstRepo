package com.list.linkedlistdemo;

import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		
		System.out.println(al.get(3));
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		
		System.out.println(ll.get(4));
		
		
	}

}
