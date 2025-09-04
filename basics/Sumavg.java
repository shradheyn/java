package basics;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Aug 30, 2025
* time: 9:34:10 AM
* project: Corejava
* this program calculates sum & avg using scanner input
*/
public class Sumavg {
	public static void main(String[] args) {
		//declaration
		int a,b,c,sum;
		float av;
		
		//input
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter org");
		String org= scanner.nextLine();
		System.out.println("enter three numbers");
		a= scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter your name");
		String name= scanner.next();
		//process
		sum=a+b+c;
		av=(float)sum/3;
		System.out.println("the sum of the three number is "+sum+" and the avg is "+av);
		System.out.println("coded by "+name+" at "+org+" training");
		
		scanner.close();
	}
	

}
