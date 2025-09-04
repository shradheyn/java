package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:11:40 PM
* project: Corejava
* Program to display Shirt size using switch -case statement
*/

public class Switchdemo3 {

	public static void main(String[] args) {
		int number;
        String size;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter ur Shirt Size:");
        number=s.nextInt();
        s.close();

        // switch statement to check size
        switch (number) {
            case 1:
            case 2:
            case 3:

                size="Kids";
                break;
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "E";
            
            default:
                size = "Unknown";
                break;
      
        }
        System.out.println("size:"+size);
	}

}

