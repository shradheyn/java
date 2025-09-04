package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:54:30 PM
* project: Corejava
*/

public class Singleinheritanceairline {
	public static void main(String[] args) {
		//create booking\
		Airlinebooking b1= new Airlinebooking("james gosling", 32, "FG567766");
		
		b1.bookTicket();
		b1.displayPassengerDetails();
		b1.displayBookingDetails();
		
		Airlinebooking b2= new Airlinebooking("rod gusain", 45, "WER23454");
		
		b2.bookTicket();
		b2.displayPassengerDetails();
		b2.displayBookingDetails();
		
	}
}
