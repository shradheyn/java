package oopsdemo2;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 12:55:44 PM
* project: Corejava
*/

public class Airlinecompositiondemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum number of bookings: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        Myairline airline = new Myairline("SkyJet Airways", capacity);

        System.out.print("Enter number of bookings to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Booking Details " + i);

            System.out.print("Booking ID: ");
            String bookingId = sc.nextLine();

            System.out.print("Passenger Name: ");
            String passenger = sc.nextLine();

            System.out.print("Flight Number: ");
            String flight = sc.nextLine();

            System.out.print("Destination: ");
            String destination = sc.nextLine();

            // Payment details
            System.out.print("Payment ID: ");
            String paymentId = sc.nextLine();

            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Payment Mode (UPI/Credit/Debit): ");
            String mode = sc.nextLine();

            // Create booking (Composition ensures Payment created with Booking)
            Ticketbooking booking = new Ticketbooking(bookingId, passenger, flight, destination, paymentId, amount, mode);
            airline.addBooking(booking);

            System.out.println("✅ Booking confirmed for " + passenger);
        }

        airline.displayAllBookings();

        System.out.print("\nEnter Booking ID to search: ");
        String searchId = sc.nextLine();
        airline.searchBooking(searchId);

        sc.close();

	}

}
