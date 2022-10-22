package com.list.linkedlistdemo;

import java.util.*;

public class DevStringProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please Enter your Full Name: ");

		String fullname = scan.nextLine();

		while (fullname.contains(" ") == false) {
			System.out.println("no space between first and last name");
			System.out.print("please re-enter your name: ");
			fullname = scan.nextLine();
//		while(fullname.matches("1")== true) {
//			System.out.println("Invalid String format");
//			System.out.print("Please re-enter your name without any numbers: ");
//			fullname = scan.nextLine();
//			}
		}

		String[] sname = fullname.split(" ");
		
		while (sname.length > 1) {
			String fn = (sname[0]);
			String ln = (sname[1]);

			char f = fn.charAt(0);
			f = (Character.toUpperCase(f));
			char l = ln.charAt(0);
			l = (Character.toUpperCase(l));

			String fnsplit = fn.substring(1);
			String lnsplit = ln.substring(1);

			String firstname = (Character.toString(f).concat(fnsplit));
			String lastname = (Character.toString(l).concat(lnsplit));
			
			System.out.println("your name has been saved as: " + firstname + " " + lastname);
		}
		System.out.print("Please Enter fullname");
		fullname = scan.nextLine();
			
			
		} 
	

	}
