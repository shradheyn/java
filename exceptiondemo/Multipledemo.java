package exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 2:55:54 PM
* project: Corejava
*/

public class Multipledemo {

	public static void main(String[] args) throws IOException {
		// Java Program to demonstrate multiple catch blocks
		BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
		int a, b, c;
		try
				{
					
					System.out.println ("Enter Any 2 Numbers");
					a = Integer.parseInt (br.readLine ());
					b = Integer.parseInt (br.readLine ());
					System.out.println("Enter your Name : ");
					String name=br.readLine();
					
					c = a / b;
					
					System.out.println ("C VALUE = " + c);
					System.out.println("Thank You "+name);
				}
		
		catch (NumberFormatException nfe) {
			System.out.println("please pass only integer values: "+nfe);
		}
		catch (ArithmeticException ae) {
			System.out.println("pls dont pass the second value as zero "+ae);
		}
		finally {
			br.close();
			System.out.println("inside finally block");
		}
		System.out.println("end of main method");
	}

}
