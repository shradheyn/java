package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 12:56:59 PM
* project: Corejava
*/

public class Abstractdemo {
	public static void main(String[] args) {
		Trainee t1=new Marks("John","New York",1001,35);  // up casting
		
		t1.show(); // invoke abstract base class method
		double marks=t1.calculatemarks();  // invoke sub class method
		System.out.println(t1 +" "+marks);
	}	
}
