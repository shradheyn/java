package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:30:07 PM
* project: Corejava
*/

public class Singleinheritancedemo {
	public static void main(String[] args) {
		Developer d1= new Developer(100, "james", "jdbc", "SANTENDER BANK");
		Developer d2= new Developer(105, "rod", "spring framework", "virgin atlantic");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1= new Employee(106, "mike");
		e1.display();
	}
}
