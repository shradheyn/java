package exceptiondemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 3:28:37 PM
* project: Corejava
*/

public class Throwdemo {
	public static void hello(int a) {
		if(a==0) 
			throw new ArithmeticException("pass non zero values");
		else
			System.out.println(a);
		
	}
	public static void main(String[] args) {
		hello(100);
		hello(0);
	}
}
