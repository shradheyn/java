package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 11:53:26 AM
* project: Corejava
*/

public class Aggregationdemo1 {

	public static void main(String[] args) {
		Address ad1= new Address("bengaluru", "karnataka", "india", 566016);
		Address ad2= new Address("prague", "austin", "czech republic",77777);
		
		Student s1= new Student(101, "rave", ad1);
		Student s2= new Student(102, "mike", ad2);
		
		s1.display();
		s2.display();

	}

}
