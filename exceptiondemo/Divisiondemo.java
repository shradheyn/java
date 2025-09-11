package exceptiondemo;

import java.util.Scanner;

/**
 * author: Shradhey.Naudiyal
 * date: Sep 6, 2025
 * time: 2:23:05 PM
 * project: Corejava
 */

public class Divisiondemo {
	public static void main(String[] args) {
		//Program to find Division of 2 nos without Exception Handling
		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();
		
		try {
		result = a / b;
		System.out.println("Result = " + result);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Divide by Zero Error. Please enter second number as NON-ZERO");
            ex.printStackTrace(); //Name,Description, StackTrace
            System.out.println("Exception Description :"+ex.getMessage());
            System.out.println("Exception Name & Description :"+ex.toString());
		}
		finally {
			input.close();
			System.out.println("in finally block");
		}
	}
}
