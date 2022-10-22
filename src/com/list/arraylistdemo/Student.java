package com.list.arraylistdemo;

import java.util.*;

//	HashCode Demo

public class Student {

	public static void main(String[] args) {
		Student sandesh = new Student();

		ArrayList x = new ArrayList();
		
		Byte b = -128;
		System.out.println(b);

		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);

		Object[] arr = x.toArray();
		for (Object refvar : arr)
			System.out.print(refvar + " ");

		/**
		 * Printing object will print hashcode of object because of toString() method
		 * which represents the object in the form of a String
		 */
		System.out.println("\n" + sandesh);

	}

	/**
	 * we can change the implementation by overriding the hashcode method
	 */

	@Override
	public int hashCode() {

		return 123;
	}

	/**
	 * toString() method in background prints the class name and the hashcode in
	 * hexadecimal value if we override toString we can whatever message we want and
	 * we can print hashcode in decimal form
	 */
	@Override
	public String toString() {

		return getClass().getName() + " Hello ";
	}

}
