package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 4:42:21 PM
* project: Corejava
*/

public class Employeetest {
	public static void main(String[] args) {
		
		//create objects of employee class
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		
		//invoke methods
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();

	}

}
