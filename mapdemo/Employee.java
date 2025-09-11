package mapdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 3:26:38 PM
* project: Corejava
*/

public class Employee {
	private int id;
    private String name;
    private String department;
    
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
    
    public void display() {
	        System.out.printf("      [Employee ID: %d | Name: %-10s | Department: %s]%n", id, name, department);
	    }
    
}
