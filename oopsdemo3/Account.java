package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:10:49 PM
* project: Corejava
*/

public class Account {
	private String name;
	protected double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//generate only getters
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	 //final methods cannot be overridden
    final void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing : "+amt);
    }
    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdrawing :"+amt);
    }	

}
