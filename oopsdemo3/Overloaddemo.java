package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 2:36:11 PM
* project: Corejava
* Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments
*/
class Addition{
	public void add() {
		System.out.println("method overloading demo");
	}
	public void add(int a,int b) {
		System.out.println("the addition of the two numbers is: "+(a+b));
	}
	public void add(double a,double b) {
		System.out.println("the addition of the two numbers is: "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("the addition of the two numbers is: "+(a+b));
	}
	public void add(String s1, String s2) {
		System.out.println("the addition of the two numbers is: "+(s1+s2));
	}
	
	
}
public class Overloaddemo {
	public static void main(String[] args) {
		Addition a1=new Addition();
		
		a1.add();
		a1.add(20,30.5f);
		a1.add(34.55f,530.50f);
		a1.add("java","programming");
		
		
	}
}
