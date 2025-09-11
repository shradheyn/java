package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 3:38:59 PM
* project: Corejava
*/

public class ATMwithdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double accountBalance = 10000; // initial balance

        try {
            System.out.println("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();

            // Risky operations
            if (withdrawAmount > accountBalance) {
                // Insufficient balance
                throw new ArithmeticException("Insufficient Balance!");
            }

            if (withdrawAmount <= 0) {
                // Invalid input
                throw new IllegalArgumentException("Amount must be greater than 0.");
            }

            accountBalance -= withdrawAmount;
            System.out.println("✅ Withdrawal Successful! Amount: ₹" + withdrawAmount);
            System.out.println("💰 Remaining Balance: ₹" + accountBalance);
        } 
        catch (InputMismatchException e) {
            // Handles invalid input type (e.g., entering text instead of number)
            System.out.println("❌ Error: Please enter only numeric values.");
        } 
        catch (ArithmeticException e) {
            // Handles insufficient balance case
            System.err.println("❌ Error: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            // Handles negative or zero withdrawal case
            System.out.println("❌ Error: " + e.getMessage());
        } 
        catch (Exception e) {
            // Handles any other unknown exception
            System.out.println("❌ Unexpected Error: " + e.getMessage());
        } 
        finally {
            // Always executed
            System.out.println("🔒 Transaction session closed. Thank you for using our ATM!");
            sc.close();
        }
	}

}
