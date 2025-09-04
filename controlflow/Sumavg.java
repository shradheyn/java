package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Aug 30, 2025
* time: 9:34:10 AM
* project: Corejava
* this program calculates sum & avg of three numbers which are greater than 100.
*/
public class Sumavg {
	public static void main(String[] args) {
		//declaration
		int a,b,c,sum;
		float av;
		
		//input
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter three numbers");
		a= scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		//process
		if((a>100)&&(b>100)&&(c>100)) {
			
		sum=a+b+c;
		av=(float)sum/3;
		System.out.println("the sum of the three number is "+sum+" and the avg is "+av);
		}else{
			System.out.println("please enter number greater than 100");
		}
		
		scanner.close();
	}
	

}
