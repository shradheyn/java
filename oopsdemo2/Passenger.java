package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:40:09 PM
* project: Corejava
*/

public class Passenger {
	 private String name;
	    private int age;
	    private String passportNumber;
   
   
   //generate constructor
	    public Passenger(String name, int age, String passportNumber) {
	    	this.name = name;
	    	this.age = age;
	    	this.passportNumber = passportNumber;
	       }
	    	
    public void displayPassengerDetails() {
     System.out.println("----- Passenger Details -----");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Passport Number: " + passportNumber);
 }


   
	

	
	
}


