package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 11:52:24 AM
* project: Corejava
*/
/*
 * * Multiple Inheritance using Interfaces 
 * 1. Create an interface Exam with method percent_cal() 
 * 2. Create a class Candidate with fields name, roll_no,mark1, mark2 and constructor to initialize them. 
 * 3. Create a class Result that extends Candidate and implements Exam interface. 
 * 4. Implement the percent_cal() method in Result class to calculate and display the percentage of marks. 
 * 5. In the main method, create an instance of Result and call the percent_cal() method to display the result.
 */

public class Multipledemo {
	public static void main(String[] args) {
		
		Result r1= new Result("john", 101, 92, 85);
		r1.display();
		r1.percent_cal();
	}
}
