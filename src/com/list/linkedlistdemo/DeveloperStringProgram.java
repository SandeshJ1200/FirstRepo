package com.list.linkedlistdemo;

/**
 * 1. Enter your first and last name using input function
 * 2. First and last name must have white space in between
 * 3. Make first letter as capital
 * 4. Print invalid String message if input is not String or not valid String
 * 5. Valid String: Firstname Lastname, firstname lastname
 */

import java.util.Scanner;

public class DeveloperStringProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "Sandesh Jadhav";

		System.out.print("Enter your name: ");

		String getname = scan.nextLine();

		while (getname.equals(name) != true) {
			System.out.println("Invalid name!");
			System.out.print("Please Re-enter your name: ");
			getname = scan.nextLine();
		}
		// scan.close();
		System.out.println("Your name is " + getname);

		System.out.println("\nName check using Regex: ");
		System.out.print("Enter your name again: ");
		String fullname = scan.nextLine();
		
		if (fullname.matches("[a-pA-Z][1-10]")) {
			System.out.println("Incorrect name, Please Re-enter: ");
			fullname = scan.nextLine();
		}
		System.out.println("Correct name! " + fullname);
	}

}
