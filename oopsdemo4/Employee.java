package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 2:30:14 PM
* project: Corejava
*/

public abstract class Employee { 
	
	private String name;
	protected double basic;
	private String address;
  
  public Employee(String name, double basic, String address) {
		this.name = name;
		this.basic = basic;
		this.address = address;
	}

  void show() {
        System.out.println("Name: \t\t\t" + name);
        System.out.println("Address: \t\t" + address);
        System.out.println("Basic: \t\t\t" + basic);
    }
	
	double deduction(int leave) {
		double lessPay;

		if(leave==0)
		{
			lessPay=0;
		}
		else if (leave <= 5) {
			lessPay = (0.25 * basic);
		} 
		
		else {
			lessPay = (0.5 * basic);
		}
		return lessPay;
	}
	// abstract method. Totalpay is different for various employees
	abstract double totalPay();
	
	
}
