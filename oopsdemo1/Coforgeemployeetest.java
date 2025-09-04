package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 4:42:21 PM
* project: Corejava
*/

public class Coforgeemployeetest {
	public static void main(String[] args) {
		
		//create objects of employee class
		Employee developer= new Employee();
		Employee tester= new Employee();
		Employee sales= new Employee();
		
		
		System.out.println("******coforge technologies******");
		//invoke methods
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
		
		

	}

}
