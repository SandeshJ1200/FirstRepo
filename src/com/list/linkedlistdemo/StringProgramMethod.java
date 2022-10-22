package com.list.linkedlistdemo;

import java.util.*;

public class StringProgramMethod {

	public String hasIntCheck(String intcheck) {
		Scanner scan = new Scanner(System.in);
		StringProgramMethod obj = new StringProgramMethod();
		String name = "";
		boolean b = false;
		
		char[] arr = intcheck.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i]) == true) {
				b = true;
			} else {
				b = false;
			}
		}

		while (b == true) {
			System.out.println("Invalid Name, It contains numbers");
			System.out.print("Please enter full name without any numbers: ");
			intcheck = scan.nextLine();
			name = intcheck;
		}

		System.out.println("Name does not contain any numbers, name saved as " + name);

		return name;

	}

//	This method checks if String contains white space or not
	public String hasWhiteSpace(String spacecheck) {
		Scanner scan = new Scanner(System.in);
		StringProgramMethod obj = new StringProgramMethod();

		while (spacecheck.contains(" ") != true) {
			System.out.print("Please Enter your Full Name: ");
			spacecheck = scan.nextLine();
		}
		scan.close();

		System.out.println("Name has space in between, name saved as: " + spacecheck);

		return obj.hasIntCheck(spacecheck);
	}

	public static void main(String[] args) {
		StringProgramMethod obj = new StringProgramMethod();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your Fullname: ");

		String getname = scan.nextLine();

		obj.hasWhiteSpace(getname);

	}

}
