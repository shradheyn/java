package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 9:51:24 AM
* project: Corejava
*/

public class Savingsbank extends Account {
	private int min_bal; // can access only within the class
	protected int  balance;  // can access within the class & in the sub class
	public Savingsbank(int accNo, String name, int min_bal, int balance) {
		super(accNo, name);
		this.min_bal = min_bal;
		this.balance = balance;
	}
	
	void display()
    {
            //super.display(); // invoke super class method
            System.out.println ("Minimum Balance: "+min_bal);
            System.out.println ("Saving Balance: "+balance);
    }
}
