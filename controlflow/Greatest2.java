package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 9:46:33 AM
* project: Corejava
*/

public class Greatest2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two numbers");
		a= sc.nextInt();
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is the greatest");
		}else {
			System.out.println(b+" is the greatest");
		}
		sc.close();

	}

}
