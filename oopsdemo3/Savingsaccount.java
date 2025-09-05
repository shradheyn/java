package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:14:37 PM
* project: Corejava
*/

public class Savingsaccount extends Account {
	
	private double interestrate;

	public Savingsaccount(String name, double balance, double interestrate) {
		super(name, balance);
		this.interestrate = interestrate;
	}
	
}

class Checkingaccount extends Account{
	private double overDraft;

	public Checkingaccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	public void withdraw(double amt) {
		 System.out.println("Overdraft Amount: " + overDraft);
	        if (amt <= balance) {
	            balance -= amt;
	            System.out.println("Withdrawing: " + amt);
	        } else if ((amt > balance) && (amt > (balance + overDraft))) {
	            System.out.println("Sorry! You cannot withdraw");
	        } else {
	            double result = amt - balance;
	            overDraft -= result;
	            balance = 0;

	            System.out.println("Withdrawing: " + amt);
	            System.out.println("Current Overdraft Amount: "
	                    + overDraft);
	        }
	}
	
	
	
}