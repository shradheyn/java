package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 12:40:16 PM
* project: Corejava
* Program to find Sum of Series . 1+2+3+ .....+n
*/

public class Sumofseries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        while(i<=n) {
        	sum=sum+i;
        	i++;
        }
        System.out.println("the sum of the series of "+n+" is "+sum);

	}

}
