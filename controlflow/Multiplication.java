package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 3:11:06 PM
* project: Corejava
*/

public class Multiplication {

	public static void main(String[] args) {
		int n;
		
		System.out.println("enter a number");
		
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		sc.close();
		System.out.println("the multiplication table of "+n+" is: ");
		for (int i = 1; i <=10; i++) {
			int mul=n*i;
			System.out.println(n+" * "+i+" = "+mul);
		}

	}

}
