package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:04:50 PM
* project: Corejava
* Program to display names of days using Switch-case
* Switch statements in Java are control flow structures,
* that allow you to execute certain block of code based on the value of a single expression
*/

public class Swichdemo1 {

	public static void main(String[] args) {
		int day;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Day Value (1-7) :");
        day=scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

	}

}
