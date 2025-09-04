package oopsdemo1;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 2:15:56 PM
* project: Corejava
* Program to demonstrate working of constructors

*/

public class Person {
	private String name,constituency;
	private int age;
	private Scanner s;
	public Person() {
		System.out.println("voter eligibility app");
		age=0;
		name="";
		constituency="bengaluru";
		s=new Scanner(System.in);
	}
	
	//2 args
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.constituency="mumbai";
	}
	
	//3 args
	public Person(String name, String constituency, int age) {
		this.name = name;
		this.constituency = constituency;
		this.age = age;
	}
	
    void input()
	{
		System.out.println("Enter ur Name:");
		name=s.nextLine();
		System.out.println("Enter ur Age:");
		age=s.nextInt();
	}
    
	
	void print()
	{
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Constituency is :"+constituency);
	}
}
