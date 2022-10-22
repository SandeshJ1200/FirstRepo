package com.list.arraylistdemo;

import java.util.ArrayList;

public class ALDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // default initial capacity
//		Collection c;

		al.add(8);
		al.add(16);
		al.add(32);
		al.add(64);
		al.add(3.14);
		al.add(14.28);
		al.add("Sandesh");
		al.add(true);
		al.add("Priyanka");
		al.add('M');
		al.add("D");
		al.add("11th element");
		al.add("Hello" + 'c');
		al.add(14.28);

		ArrayList al2 = new ArrayList();

		al2.add(8);
		al2.add(16);
		al2.add(32);
		al2.add(64);

		// ArrayList Class Methods

		// Print object
		System.out.println(al);

		// Returns the number of elements in the collection
		System.out.println(al.size());

		// Returns true if this list contains no elements.
		System.out.println(al.isEmpty());

		// returns true if and only if this list contains at least one similar element
		System.out.println(al.contains("Priyanka"));

		// don't know
		System.out.println(al.iterator());

		// Converts collection into Array
		Object[] c = al.toArray();
		for (Object d : c) {
			System.out.print(d + " ");
		}

		// get() Returns the element at the specified position in this list
		System.out.println();
		System.out.println(((String) al.get(8)).charAt(0));

		// Appends the specified element to the end of this list.
		System.out.println(al.add(22));

//		Removes a specific element
		al.remove((Object) "Helloc");
		System.out.println(al);

//		Removes a specific element
		al.remove(5);
		System.out.println(al);

//		retains all elements common in the first collection
		al.retainAll(al2);
		System.out.println();

//		Removes all elements
		al.removeAll(al2);
		System.out.println(al);

//		Overriding ArrayList Constructors
//		copying elements from one ArrayList to other

		ArrayList al3 = new ArrayList();
		al3.add("old1");
		al3.add("old2");
		al3.add("old3");
		
		
//		for (int i = 0; i < al2.size(); i++) {
//			al3.add(al2.get(i));
//		}
		System.out.println("copied elements " + al3);

//		setting new initial capacity
		ArrayList al4 = new ArrayList(50);

	}

}
