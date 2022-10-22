package com.list.arraylistdemo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

//		List l = new List(); cannot make an object of list
//		because List is a Interface Class

		ArrayList x = new ArrayList();
		ArrayList y = new ArrayList();
		ArrayList z = new ArrayList();

		x.add(12);
		x.add(13);
		x.add(28);
		x.add(26);
		x.add(4);
		x.add(8);
		x.add(2);
		x.add(6);

		y.add(2);
		y.add(3);
		y.add(6);
		y.add(12);

//		Print Collection
		System.out.println("X object Collection\n " + x);
		System.out.println("Y object Collection\n " + y);

//		1. Print List Size
		System.out.println("1. " + x.size());

//		2. Print true if empty false if not empty
		System.out.println("2. " + z.isEmpty());

//		if collection contains an object
		System.out.println("3. " + x.contains(x));

//		Returns an array containing all of the elements in this list in proper
//		sequence (from first to last element)
		// System.out.println("4. " + x.toArray());
		System.out.print("4. To Array print using Loop ");
		for (Object refvar : x.toArray())
			System.out.print(refvar + " ");

//		Inserts new object/element at index and Right shift existing elements
		x.add(2, "new");
		System.out.println("\n5. " + x);

//		Removes element at the index, left shifts element
		x.remove(4);
		System.out.println("6. " + x);

//		if a collection contains a specific element/object
		System.out.println("7. " + x.contains(6));

//		 if a collection contains all elements
		System.out.println("8. " + x.containsAll(y));

//		from index is inclusive of element
//		to index is exclusive of element
		System.out.println("8. " + x.subList(1, 4));

//		Add a collection to a existing collection at Index
		x.addAll(0, y);
		System.out.println("9. " + x);

//		Retain all matching elements
		x.retainAll(y);
		System.out.println("10." + x);

//		Remove all elements from a collection
		y.removeAll(y);
		System.out.println("11." + y);

//		Replaces the element at the index
		x.set(5, 1);
		System.out.println("12." + x);

//		Compares collection
		System.out.println("13. " + x.equals(y));

//		Removes all of the elements from this list. The list will be empty after this call returns
		x.clear();
		System.out.println("15. " + x);
	}

}
