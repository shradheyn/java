package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 11:49:57 AM
* project: Corejava
*/

public class Financestaticexample {

	public static void main(String[] args) {
		 // Create Accounts
        Bankaccount acc1 = new Bankaccount("Alice", 5000);
        Bankaccount acc2 = new Bankaccount("Bob", 10000);

        // Show details (interestRate is common for both)
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        System.out.println("\n📌 Changing interest rate...");
        Bankaccount.setInterestRate(7.5); // Static method call (class-level)

        // After updating interest rate
        acc1.showAccountDetails();
        System.out.println("-------------------");
        acc2.showAccountDetails();

        // Static method to calculate interest
        double si = Bankaccount.calculateSimpleInterest(20000, 3);
        System.out.println("\n💰 Simple Interest on 20000 for 3 years = " + si);

	}

}
