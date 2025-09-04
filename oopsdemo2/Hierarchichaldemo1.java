package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 10:40:58 AM
* project: Corejava
*/

public class Hierarchichaldemo1 {

	public static void main(String[] args) {
		 //invoke child class Specialist constructor
		Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");
		Specialist spObj2=new Specialist(1002,"Siya","noida","Physician");

		
		spObj.display(); // invoke child class Specialist display() method
		spObj2.display();
		
		//invoke child class NonSpecialist constructor
		Nonspecialist nspObj=new Nonspecialist(1005,"John","Sydney");
		
		nspObj.display();// invoke base class Doctor display() method

	}

}
