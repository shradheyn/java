package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 3:00:46 PM
* Program to find Factorial of a Number
* project: Corejava
*/

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=num; i++) {
           fact*=i;
        }
        System.out.println("The Factorial of "+num+" is: "+fact);
	}

}
