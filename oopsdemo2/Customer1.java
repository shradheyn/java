package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 10:47:24 AM
* project: Corejava
*/

public class Customer1 {
	private String name;
    private String email;
    
    
     public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}

	 public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
