package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 12:53:40 PM
* project: Corejava
*/

public class Marks extends Trainee {
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	@Override
	public double calculatemarks() {
		System.out.println("calculate marks: ");
		return marks*2;
	}



	
	
}
