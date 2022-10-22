package com.list.vectordemo;
import java.util.*;

public class VectorConstructorDemo {
	
	public static void main(String[] args) {
		
/**
 * 	1. Vector(int initialCapacity, int capacityIncrement)
	2. Vector(int initialCapacity)
	3. Vector()
	4. Vector(Collection<? extends E> c)
 */
//		Default Constructor, default capacity = 10;
		Vector v = new Vector();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		System.out.println(v);
		
//		Copy list from one to other vector object
		Vector v2 = new Vector(v);
		System.out.println(v2);
		
//		Set Default Capacity
		
		Vector v3 = new Vector(15);
		System.out.println(v3.capacity());
		
//		Set Capacity to increase by x amount
		
		Vector v4 = new Vector(2, 3);
		System.out.println("Default capacity: "+ v4.capacity());
		v4.add(1);
		v4.add(2);
		System.out.println("Capacity after filling to limit: " + v4.capacity());
		v4.add(3);
		System.out.println("Capacity after growing(2+3): " + v4.capacity());
	}

}
