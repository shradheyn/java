package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * author: Shradhey.Naudiyal
 * date: Aug 30, 2025
 * time: 10:35:31 AM
 * project: Corejava
 */

public class Bufferreaderdemo {

	public static void main(String[] args) throws IOException {

		InputStreamReader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);

		System.out.println("enter your name");
		String name=br.readLine();

		System.out.println("enter your age");
		int age=Integer.parseInt(br.readLine());

		System.out.println("enter your salary:");
		float sal= Integer.parseInt(br.readLine());


		System.out.println( "welcome "+name+ " your age is "+age);	
		System.out.println("your salary is: "+sal);
	}

}
