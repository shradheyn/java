package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 10:09:59 AM
* project: Corejava
* program to check whether the entered number is single digit or not
*/

public class Singledigit {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a numbers");
		num= sc.nextInt();
		
		if(num>-10 && num<10) {
			System.out.println(num+" is single digit number");
		}else {
			System.out.println(num+" is not a single digit number");
		}
		sc.close();

	}

}
