package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* author: Shradhey.Naudiyal
* date: Aug 30, 2025
* time: 11:26:13 AM
* project: Corejava
* program to perform arithmetic operations using bufferedreader input
*/

public class Arithemetic {

	public static void main(String[] args) throws IOException {
		int a,b,sum,sub,mul;
		float div;
		String name;
		
		//buffered reader for input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//input statement - take input using buffered reader
		System.out.println("enter 2 numbers:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		System.out.println("enter your name:");
		name=br.readLine();
		
		//process
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;
		
		//printing the outputs
		System.out.println("*******arithemetic operations*******");
		System.out.println("the sum of the two number is "+sum);
		System.out.println("the subtraction of the two number is "+sub);
		System.out.println("the multiplication of the two number is "+mul);
		System.out.println("the division of the two number is "+div);
		System.out.println("program created by: "+name);

		
		
		

	}

}
