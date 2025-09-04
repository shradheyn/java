package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 11:52:02 AM
* project: Corejava
* Program to Check whether entered alphabet using Ternary Operator
*/

public class Ternarydemo2 {

	public static void main(String[] args) {
		char mychar;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Character :");
        mychar=scanner.next().charAt(0); // Take Single character Input
        scanner.close();
        // Ternary Operator
        String output=((mychar>='a' && mychar<='z') || (mychar>='A' && mychar<='Z'))? mychar+" is a alphabet": mychar+" is not a alphabet";
        System.out.println(output);
	}

}
