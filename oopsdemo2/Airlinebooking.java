package oopsdemo2;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:45:38 PM
* project: Corejava
*/

public class Airlinebooking extends Passenger {
	

	String flightName;
	String fromCity;
	String toCity;
	int seatNo;
	float ticketPrice;
	
	Scanner scanner= new Scanner(System.in);
	public Airlinebooking(String name, int age, String passportNumber) {
		super(name, age, passportNumber);
	}
	
	 void bookTicket() {
			
			System.out.println("Enter Flight Name :");
			flightName = scanner.next();
			System.out.println("Enter From City :");
			fromCity = scanner.next();
			System.out.println("Enter To City :");
			toCity = scanner.next();
			System.out.println("Enter Seat No :");
			seatNo = scanner.nextInt();
			System.out.println("Enter Ticket Price :");
			ticketPrice = scanner.nextFloat();
		}
		
		void displayBookingDetails() {
			System.out.println("************* Booking Details ***********");
			System.out.println("Flight Name  :  " + flightName);
			System.out.println("From City    :  " + fromCity);
			System.out.println("To City      :  " + toCity);
			System.out.println("Seat No      :  " + seatNo);
			System.out.println("Ticket Price :  " + ticketPrice);
		}
		
	
	
}
