package com.list.linkedlistdemo;

import java.util.*;

public class LinkedListConstructors {
	public static void main(String[] args) {
		
/** Linked List Constructors
 * No set Default capacity of Linked List
 * 	1. LinkedList();
 *  2. LinkedList(Collection c)
 */
		
//		Default Constructor
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println("Original LL List: " + ll);
		
//		Constructor to copy list from one to new list
		
		LinkedList ll2 = new LinkedList(ll);
		
		System.out.println("LL2 copied list " + ll2);
		
		
	}

}
