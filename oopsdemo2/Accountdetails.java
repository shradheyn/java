package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 9:54:54 AM
* project: Corejava
*/

public class Accountdetails extends Savingsbank {
	
	int withdrawl,deposit,finalBalance;

	public Accountdetails(int accNo, String name, int min_bal, int balance, int wirthdraw1, int deposit) {
		super(accNo, name, min_bal, balance);
		this.withdrawl = wirthdraw1;
		this.deposit = deposit;
	}
	
	 void display()
	    {
	            super.display(); // invokes savings bank display()method
	            System.out.println ("Deposit: "+deposit);
	            System.out.println ("Withdrawals: "+withdrawl);
	            finalBalance=(balance+deposit)-withdrawl;
	            System.out.println("Final Balance:" + finalBalance);
	    }
	
	
}
