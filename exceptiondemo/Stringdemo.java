package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 2:45:55 PM
* project: Corejava
*/

public class Stringdemo {
	public static void main(String[] args) {
		String s1="hello world";
		String s2= null;
		try {
			System.out.println(s1.length());
			System.out.println(s2.length());
		}catch (Exception e) {
			System.err.println("exception occured"+e);
		}
	}
}
