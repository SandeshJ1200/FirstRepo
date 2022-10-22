package com.list.arraylistdemo;

import java.util.*;

public class ArrayListNested {

	public static void main(String[] args) {


		ArrayList group = new ArrayList();

		ArrayList boysName = new ArrayList();

		boysName.add("Sandesh");
		boysName.add("Shubham");
		boysName.add("Rahul");

		ArrayList girlsName = new ArrayList();

		girlsName.add("Priyanka");
		girlsName.add("Prajakta");
		girlsName.add("Pinky");

		System.out.println();

		group.add(boysName);
		group.add(girlsName);

		System.out.println(((ArrayList) group.get(1)).get(0));

	}

}
