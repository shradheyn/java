package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:45:37 PM
* project: Corejava
*/

public class Sumpositive {

	public static void main(String[] args) {
	       int sum=0,number=0;
	       Scanner input =new Scanner(System.in);

	// Loop continues until entered number is Positive
	       while(number>0) {
	    	   sum+=number;
	    	   System.out.println("enter a number");
	    	   number= input.nextInt();
	    	
	       }
	       System.out.println("the sum of positive numbers is:"+sum);
	       input.close();

	}

}
