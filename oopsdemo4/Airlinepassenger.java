package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 10:17:48 AM
* project: Corejava
*/

public class Airlinepassenger implements Passenger {
	private String name;
    private String passportNumber;
    private String email;
    private String phone;
	public Airlinepassenger(String name, String passportNumber, String email, String phone) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getPassportNumber() {
		return passportNumber;
	}
	@Override
	public String getContactInfo() {
		return "email:"+email+", phone:"+phone;
	}
    
	
	
    
}
