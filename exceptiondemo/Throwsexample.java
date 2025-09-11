package exceptiondemo;

import java.io.IOException;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 3:50:12 PM
* project: Corejava
*/

public class Throwsexample {
	void myMethod(int a) throws IOException, ArithmeticException
	{
		if(a==1)
			throw new IOException("ioexception occured");
		else
			throw new ArithmeticException("arithemetic exception");
	}
	public static void main(String[] args) {
		Throwsexample t= new Throwsexample();
		try {
			t.myMethod(1);
		} catch (Exception ex) {
			System.err.println(ex);
		}
		
	}
}
