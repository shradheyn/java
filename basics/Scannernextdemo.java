package basics;

/**
* author: Shradhey.Naudiyal
* date: Aug 30, 2025
* time: 11:58:37 AM
* project: Corejava
* Program to demonstrate Scanner next()  method with Character & Strings

*/
import java.util.*;
public class Scannernextdemo {

	public static void main(String[] args) {
		char ch;
        String fullName,firstName;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Initials :");
        ch=scanner.next().charAt(0); // Single Character Input
        System.out.println("Enter Your First Name : ");
        firstName=scanner.next(); // Single Word Input

        scanner.nextLine(); // to Pause & take input for nextLine()
        System.out.println("Enter Your Full Name :");
        fullName=scanner.nextLine(); // Multiple Words Input

        scanner.close();

        System.out.println("Your Initials : "+ch);
        System.out.println("First Name    : "+firstName);
        System.out.println("Full Name     : "+fullName);

	}

}
