package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 11:46:20 AM
* project: Corejava
*/

public class Result extends Candidate implements Exam {

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		System.out.println("*********candidate result*********");
	}

	@Override
	public void percent_cal() {
		
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println("percentage: "+percent+"%");
	}
	
}
