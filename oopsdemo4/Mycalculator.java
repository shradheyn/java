package oopsdemo4;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 4:39:56 PM
* project: Corejava
*/

public class Mycalculator implements IMath {
	Scanner kb;

	@Override
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("SUbtraction of "+a+" and "+b+" is "+s);	
		
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void div() {
		  kb = new Scanner(System.in);
	        System.out.println("Enter any two integer values to perform Division");
	        int a=kb.nextInt();
	       int b=kb.nextInt();
	        float s=(float)a/(float)b;
	        System.out.println("Div of "+a+" and "+b+" is "+s);	
	}
	void display()
	{
		System.out.println("My Calculator - Designed by Raj");
	}
	
	public static void main(String[] args) {
		Mycalculator c1= new Mycalculator();
		
		c1.display();
		c1.add();
		c1.sub();
		c1.div();
		c1.mul();
	}
	
	
}

