package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 9:52:29 AM
* project: Corejava
*/

public class CheckingAccount {
	private double balance;
    private int number;
	public CheckingAccount( int number) {
		this.number = number;
	}
	
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	
	public void deposit(double amount) {
	    balance += amount;
	}
	    
	// method may throw user defined exception - InSufficientFundsException
    public void withdraw(double amount) throws Insufficientfundsexception {
        if(amount <= balance) {
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new Insufficientfundsexception(needs);
        }
    }
    
}
