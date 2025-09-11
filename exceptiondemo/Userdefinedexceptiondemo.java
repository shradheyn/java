package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 9:57:01 AM
* project: Corejava
*/

public class Userdefinedexceptiondemo {

	public static void main(String[] args) {
		CheckingAccount ck1= new CheckingAccount(101);
		
		System.out.println("depositing 5000$--------");
		ck1.deposit(5000);
		
		try {
			System.out.println("withdrawing 2000$-------");
			ck1.withdraw(2000);	
			System.out.println("withdrawing 2000$-------");
			ck1.withdraw(6000);	
		} catch (Insufficientfundsexception e) {
			System.err.println("sorry insufficient balance: "+ck1.getBalance());
			e.printStackTrace();
		}
	}

}
