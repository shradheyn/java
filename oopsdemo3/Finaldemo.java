package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 11:54:56 AM
* project: Corejava
* 
* Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class
*/
final class Hello{
	final void display() {
		System.out.println("this is a final method");
	}
}
//class World extends Hello{ //final class cannot be extended
//	final void display() {
//		System.out.println("this is a final method");
//	}
//}
public class Finaldemo {

	public static void main(String[] args) {
		final int AGE=20;
		final float pi=3.142f;
		
		//AGE=30;

	}

}
