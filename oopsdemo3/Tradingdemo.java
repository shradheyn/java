package oopsdemo3;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 4:44:41 PM
* project: Corejava
* Program to demo Method Overriding + User Input + Polymorphism.
   The user can choose trading type and see profit/loss based on input.
*/

public class Tradingdemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("===== Trading System =====");
        System.out.println("1. General Trading");
        System.out.println("2. Stock Trading");
        System.out.println("3. Crypto Trading");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the investment amount: ");
        double amount = scanner.nextDouble();

        Trading trading; // Parent reference

        switch (choice) {
            case 1:
                trading = new Trading(amount);
                break;
            case 2:
                trading = new Stocktrading(amount);
                break;
            case 3:
                trading = new Cryptotrading(amount);
                break;
            default:
                System.out.println("Invalid choice! Defaulting to General Trading.");
                trading = new Trading(amount);
        }

        // Display details and profit/loss
        trading.tradeDetails();
        System.out.println("Profit/Loss = " + trading.calculateProfitLoss());

        scanner.close();
	}
}
