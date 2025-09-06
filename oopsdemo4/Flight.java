package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 10:06:07 AM
* project: Corejava
*/

public interface Flight {
	String getFlightNumber();
	String getAirline();
	String getDeparture();
	String getArrival();
	double getPrice();
	void displayFlightDetails();
}

//Booking Interface
interface Booking {
	void bookFlight(Flight flight, Passenger passenger);
	void cancelBooking(String bookingId);
	void displayBookingDetails();
}

//Payment Interface
interface Payment {
	void processPayment(double amount);
	boolean isPaymentSuccessful();
	String getTransactionId();
}

//Passenger Interface
interface Passenger {
	String getName();
	String getPassportNumber();
	String getContactInfo();
}
