package com.list.linkedlistdemo;

public class NestedWhileLoop {
	
	public static void main(String args[]){
		int i=1,j=1;
		    while(i<=10)
		    {
		        while(j<=10)
		        {
		        System.out.print(j);
		            j++;        
		        }
		       
		        System.out.println("");
		        j=i+1;
		        i++;
		    }
		}
		
}
