package oopsdemo1;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 12:31:11 PM
* project: Corejava
*/

public class Complextest {

	public static void main(String[] args) {
		Complex c1= new Complex(5, 6);
		Complex c2= new Complex(2, 5);
		c1.add(c2);
		System.out.println("the addition of the two complex number is ");
		c1.display();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter real and imaginary part of the complex number");
		double r=sc.nextDouble();
		double i=sc.nextDouble();
		sc.close();
		Complex c4=new Complex(r, i);
		c2.add(c4);
		System.out.println("the addition of the two complex number is");
		c2.display();
	}

}
