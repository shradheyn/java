package exceptiondemo;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 3:59:06 PM
* project: Corejava
*/

public class ATMSthrows {
	private double balance;

	public ATMSthrows(double balance) {
		this.balance = balance;
	}
	

	// Method that may throw exception
		public void withdraw(double amount) throws ArithmeticException, IllegalArgumentException {
			if (amount > balance) {
				throw new ArithmeticException("❌ Insufficient Balance! Available: ₹" + balance);
			} else if (amount <= 0) {
				throw new IllegalArgumentException("❌ Withdrawal amount must be greater than 0.");
			}
			balance -= amount;
			System.out.println("✅ Withdrawal Successful! Amount: ₹" + amount);
			System.out.println("💰 Remaining Balance: ₹" + balance);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ATMSthrows atm = new ATMSthrows(10000); // initial balance

			try {
				System.out.println("Enter withdrawal amount: ");
				double amount = sc.nextDouble();

				// Method call - must handle exception
				atm.withdraw(amount);

			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unexpected Error: " + e.getMessage());
			} finally {
				System.out.println("🔒 Transaction session closed. Thank you for using our ATM!");
				sc.close();
			}
		}
}
