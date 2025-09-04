package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 10:05:01 AM
* project: Corejava
* program to check whether the entered number is odd or even
*/

public class Oddeven {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a numbers");
		num= sc.nextInt();
		if(num%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
		sc.close();
	}

}
