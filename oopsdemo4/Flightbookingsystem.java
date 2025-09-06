package oopsdemo4;

/**
 * author: Shradhey.Naudiyal
 * date: Sep 6, 2025
 * time: 10:35:02 AM
 * project: Corejava
 */
//Main Class to demonstrate the flight booking system using interfaces
public class Flightbookingsystem {
	public static void main(String[] args) {
		// Create flights
        Flight flight1 = new Commercialflight("AA123", "American Airlines", 
                                            "New York (JFK)", "London (LHR)", 
                                            "10:00 AM", "10:00 PM", 899.99);
        Flight flight2 = new Commercialflight("DL456", "Delta Airlines", 
                                            "Los Angeles (LAX)", "Tokyo (HND)", 
                                            "01:00 PM", "04:00 PM (next day)", 1299.99);

        // Display flight details
        flight1.displayFlightDetails();
        flight2.displayFlightDetails();

        // Create a passenger
        Passenger passenger = new Airlinepassenger("John Smith", "P12345678", 
                                                 "john.smith@email.com", "+1-555-123-4567");

        // Create a booking
        Booking booking = new Flightbooking();
        booking.bookFlight(flight1, passenger);
        
        // Process payment
        Payment payment = new Creditcardpayment();
        payment.processPayment(flight1.getPrice());
        
        if (payment.isPaymentSuccessful()) {
            System.out.println("\nFlight booking completed successfully!");
            booking.displayBookingDetails();
        } else {
            System.out.println("\nPayment failed. Booking not confirmed.");
            booking.cancelBooking(((Flightbooking)booking).getBookingId());
        }

	}
}
