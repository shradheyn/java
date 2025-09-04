package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 12:16:51 PM
* project: Corejava
*/

public class Candidatetest {

	public static void main(String[] args) {
		
		//invoke parameterized constructor
		Candidate c1= new Candidate(1, "james", 3000.00f);
		Candidate c2= new Candidate(1, "nigs", 234561.00f);
		
		c1.calculateDA();
		c1.display();
		
		c2.calculateDA();
		c2.display();

	}

}
