package oopsdemo2;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 9:58:18 AM
* project: Corejava
* multi level inheritance demo
*/

public class Multilevel1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Account Details of Customer(Cust No,Name, Balance):");
		int custNo=scanner.nextInt();
		scanner.nextLine();
		String name=scanner.nextLine();
		int balance=scanner.nextInt();
		final int MIN_BAL=1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit=scanner.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw=scanner.nextInt();
		scanner.close();
		 Accountdetails ac1=new Accountdetails(custNo, name, MIN_BAL, balance, withdraw, deposit);
		 
		 ac1.display();

	}

}
