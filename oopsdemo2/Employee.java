package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:19:17 PM
* project: Corejava
*/

public class Employee {
	private int empId;
	private String name;
	
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}
}
