package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 12:49:23 PM
* project: Corejava
*/
//airline class manages multiple bookings!
public class Myairline {
	private String airlineName;
    private Ticketbooking[] bookings;
    private int bookingCount;
    
	public Myairline(String airlineName, int capacity) {
		super();
		this.airlineName = airlineName;
		this.bookings = new Ticketbooking[capacity];
		this.bookingCount =0;
	}
	
	public void addBooking(Ticketbooking booking) {
        if (bookingCount < bookings.length) {
            bookings[bookingCount] = booking;
            bookingCount++;
        } else {
            System.out.println("⚠️ Booking limit reached!");
        }
    }

    public void displayAllBookings() {
        System.out.println("\n===== " + airlineName + " Bookings =====");
        if (bookingCount == 0) {
            System.out.println("No bookings available.");
        } else {
            for (int i = 0; i < bookingCount; i++) {
                bookings[i].displayBooking();
                System.out.println("---------------------------");
            }
        }
    }
    
    public void searchBooking(String bookingId) {
        boolean found = false;
        for (int i = 0; i < bookingCount; i++) {
            if (bookings[i].getBookingId().equalsIgnoreCase(bookingId)) {
                System.out.println("\n✅ Booking Found:");
                bookings[i].displayBooking();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("⚠️ No booking found with ID: " + bookingId);
        }
    }
    
    
    

}
