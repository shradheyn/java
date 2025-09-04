package oopsdemo1;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 2:22:41 PM
* project: Corejava
*/

public class Persontest {

	public static void main(String[] args) {
		Person p1= new Person();
		
		p1.input();
		p1.print();
		
		System.out.println("___________________");
		Person p2= new Person("mike", 45);
		p2.print();
		
		System.out.println("___________________");
		Person p3= new Person("navin", "chennai", 45);
		p3.print();
		
		System.out.println("___________________");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name, constituency and age:");
		String name=sc.next();
		String c=sc.next();
		int a=sc.nextInt();
		
		Person p4=new Person(name,c,a);
		p4.print();
		sc.close();
	}

}
