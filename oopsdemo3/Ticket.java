package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 10:00:31 AM
* project: Corejava
*/

public class Ticket {
	private String movieName;
    private double price;
    
	public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	}
	
    public void showTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: " + price);
    } 
}
