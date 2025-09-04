package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 9:48:24 AM
* project: Corejava
*/

public class Account {
	int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	 void display()
		{
			System.out.println("************ Account Details ************");
			System.out.println("Account Number :"+accNo);
			System.out.println("Customer Name :"+name);
		}
}
