package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 3:16:34 PM
* project: Corejava
* 	Overriding is a feature that allows a subclass or
	 * child class to provide a specific implementation of a method
	 * that is already provided by one of its super-classes or parent classes.
*/

 class Bank {

	 private String name;
	 
	 
	  public Bank(String name) {
		this.name = name;
	}
	  int getRateOfInterest(){
	        return 0;
	    }
	    void display(){
	        System.out.println("Welcome to "+name+" Bank");
	    }
}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 5;
	}
	
}

class ICICI extends Bank{

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 7;
	}
	
}

class Axis extends Bank{

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}

public class Overridedemo{
	public static void main(String[] args) {
		SBI sbibank= new SBI("SBI");
		ICICI icicibank= new ICICI("ICICI");
		Axis axisbank= new Axis("Axis");
		
		sbibank.display();
		System.out.println("rate of interest of sbi:"+sbibank.getRateOfInterest());
		
		icicibank.display();
		System.out.println("rate of interest of icici:"+icicibank.getRateOfInterest());
		
		axisbank.display();
		System.out.println("rate of interest of axis:"+axisbank.getRateOfInterest());

	}
}

