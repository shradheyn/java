package oopsdemo1;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 4:11:24 PM
* project: Corejava
* instance class to define blueprint of a student
*/

public class Student {
	//properties /states /attributes
	private int rollno;
	private String name,course;
	private float m1,m2,m3,total;
	
	Scanner sc= new Scanner(System.in);
	
	// instance methods /behavior /functions
	//jvm will invoke default constructor for initialization of object
	
	public void input() {
		System.out.println("enter the roll no, name and course");
		rollno=sc.nextInt();
		name=sc.next();
		course=sc.next();
		
		System.out.println("enter the marks in 3 subjects");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
	}
	
	public float calculate() {
		total=m1+m2+m3;
		return total;
	}
	
	public void display() {
		System.out.println("*******student details******");
		System.out.println("roll no \t"+rollno);
		System.out.println("name \t"+name);
		System.out.println("course \t"+course);
		System.out.println("total \t"+total);
		System.out.println("********************************");
	}
};

