package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 12:52:11 PM
* project: Corejava
*/

public class Timetest {

	public static void main(String[] args) {
		Time t1= new Time(12,45,55);
		Time t2= new Time(10, 30, 30);
		
		t1.display();
		t2.display();
		t1.add(t2);
		t1.display();
		System.out.println(t1);

	}

}
