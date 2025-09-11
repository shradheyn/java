package miscellaneous.banking;

/**
* author: Shradhey.Naudiyal
* date: Sep 8, 2025
* time: 4:39:40 PM
* project: Corejava
*/

public class BankingGenericsDemo {
	public static void main(String[] args) {
		BankAccount<Integer> savingsAcc= new BankAccount<Integer>("alice", 123456);
		BankAccount<String> currentAcc= new BankAccount<>("bob", "CUR-7890");
		BankAccount<Long> loanAcc= new BankAccount<>("charlie", 123456346L);
		
		
		System.out.println("=== Account Details ===");
        savingsAcc.displayAccountInfo();
        currentAcc.displayAccountInfo();
        loanAcc.displayAccountInfo();

        System.out.println("\n=== Transactions ===");
        // Using Generic Method for different transaction types
        BankingUtil.printTransaction("Deposit of $5000");
        BankingUtil.printTransaction(2500.75);  // double amount
        BankingUtil.printTransaction(12345);    // transaction ID

	}
}
