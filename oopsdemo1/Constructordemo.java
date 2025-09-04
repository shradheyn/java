package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 11:50:30 AM
* project: Corejava
* Constructor is a special method with the same name of a class, 
 * which initializes an Object properties.
 * Same name as the class and no return type.
 * Special Method invoked whenever an instance/object of a given class is created.
*/

public class Constructordemo {
	 int id;
	String name;
	float salary;
	public Constructordemo() {
		System.out.println("i am an implicit constructor");
		id=101;
		name="mike";
		salary=5000.00f;
	}
	
	// generate Constructor with arguments
	// Source Menu -> Generate Constructor using Fields
	// --> Select All --> Generate Button
	public Constructordemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("i am a parameterized constructor");
	}
	
	void display() {
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	public static void main(String[] args) {
		
		Constructordemo cd1= new Constructordemo();
		Constructordemo cd2= new Constructordemo(102,"john",6000.00f);
		Constructordemo cd3= new Constructordemo(103,"gavin",5000.00f);
		
		Constructordemo cd4= new Constructordemo();
		Constructordemo cd5= new Constructordemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
		}
	
}
