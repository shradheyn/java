package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 4:26:28 PM
* project: Corejava
*/

public class Studenttest {
	public static void main(String[] args) {
		
		//create an object of the student class
		Student s1=new Student();
		Student s2= new Student();
				
		//invoke methods of studentclass using dot operator
		s1.input();
		float tot1=s1.calculate();
		s1.display();
		System.out.println("total displayerd from main: "+tot1);
		
		//invoke methods of studentclass using dot operator
				s2.input();
				float tot2=s2.calculate();
				s2.display();
				System.out.println("total displayed from main: "+tot2);
	}
};
