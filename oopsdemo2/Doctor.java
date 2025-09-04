package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 10:35:49 AM
* project: Corejava
*/

public class Doctor {
	
	int idNumber;
	String name;
	String address;
	
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println("********* Doctor Details ***********");
		System.out.println("The name is :" + name);
		System.out.println("The number is :" + idNumber);
		System.out.println("The address is :" + address);
	}
	
}

class Specialist extends Doctor {
	
	String speciality;

	public Specialist(int idNumber, String name, String address, String speciality) {
		super(idNumber, name, address);
		this.speciality = speciality;
	}

	void display() {
		super.display(); // call base class method
		System.out.println("The speciality is :" + speciality);
	}
}

class Nonspecialist extends Doctor{

	public Nonspecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);
	}
	
}
