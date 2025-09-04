package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 2:19:33 PM
* project: Corejava
*/

public class Dowhiledemo {

	public static void main(String[] args) {
		  int number;
	        Scanner scanner=new Scanner(System.in);

	        do{
	            System.out.println("Enter a Number : ");
	            number=scanner.nextInt();
	            System.out.println(number);
	        }while(number>0);
	        scanner.close();
	        System.out.println("The Entered Number is : "+number);

	}

}
