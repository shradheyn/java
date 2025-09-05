package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 10:01:27 AM
* project: Corejava
*/

public class Regularticket extends Ticket {
	private String seatNumber;
	
	public Regularticket(String movieName, double price, String seatNumber) {
		super(movieName, price);
		this.seatNumber = seatNumber;
	}


	public void showSeat() {
        System.out.println("Seat Number: " + seatNumber);
    }
}

class Premiumticket extends Ticket{
	private String loungeaccess;

	public Premiumticket(String movieName, double price, String loungeaccess) {
		super(movieName, price);
		this.loungeaccess = loungeaccess;
	}
    public void showLoungeAccess() {
        System.out.println("Lounge Access: " + loungeaccess);
    }
}
