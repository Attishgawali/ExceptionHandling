package com.practice;

import java.util.Scanner;

//this is custom exception
class AgeInvalidException extends Exception {
	AgeInvalidException(){
		super("Invalid age");
	}
	AgeInvalidException(String message){
		super(message);
	}
}

public class Example {
	
	public static void main(String[] args) {
		System.out.println("Started...");
		System.out.println("Enter two numbers ");
		try {
			
			Scanner sc = new Scanner(System.in);
			
			int age = Integer.parseInt(sc.next());
			int n2 = Integer.parseInt(sc.next());
			
			if(age<0) {
				// throw keyword is use to create excpetion
				throw new AgeInvalidException(); 
			}
			
			if(age<10) {
				// throw keyword is use to create excpetion
				throw new AgeInvalidException("Age is less than 10"); 
			}
			int result = age/n2;
			
			System.out.println(result);
			
			
		}
		catch(NumberFormatException e) {
			// this will handle exception if user provide wrong input
			System.out.println("You Provide Invalid Input");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			// this will handle exception if user try divide by zero
			System.out.println("Cannot divide by zero");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error !!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("this block will always executed");
			System.out.println("Closing All Resources");
		}
		System.out.println("Terminated...");
	}
}


