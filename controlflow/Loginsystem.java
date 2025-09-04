package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 2:41:43 PM
* project: Corejava
*/

public class Loginsystem {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        String correctUsername = "admin";
	        String correctPassword = "12345";
	        
	        int attempts = 0;
	        boolean isLoggedIn = false;
	        
	        do {
	            System.out.print("Enter Username: ");
	            String username = scanner.nextLine();
	            
	            System.out.print("Enter Password: ");
	            String password = scanner.nextLine();
	            scanner.close();
	            if (username.equals(correctUsername) && password.equals(correctPassword)) {
	                System.out.println("✅ Login Successful! Welcome, " + username + "!");
	                isLoggedIn = true;
	                break; // exit loop if login is correct
	            } else {
	                System.out.println("❌ Invalid Username or Password. Try again.");
	                attempts++;
	            }
	            
	        } while (attempts < 3);
	        
	        if (!isLoggedIn) {
	            System.out.println("⛔ Account locked due to 3 failed login attempts.");
	        }
	        

	}

}
