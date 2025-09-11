package exceptiondemo;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 2:23:05 PM
* project: Corejava
*/

public class Division {
public static void main(String[] args) {
	//Program to find Division of 2 nos without Exception Handling




	int a, b, result;
	        Scanner input = new Scanner(System.in);

	        System.out.println("Input two integers :");
	        a = input.nextInt();
	        b = input.nextInt();

	        result = a / b;
	        System.out.println("Result = " + result);
	        
	        input.close();
}
}
