package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 10:01:30 AM
* project: Corejava
*/

public class Arraysio {

	public static void main(String[] args) {
		int [] marks= {78,56,23,44,90,98,67,55,35,84};
		
		System.out.println("*****array of marks********");
		
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+"\t");	
		}
		
		System.out.println();
		System.out.println("the size of the array is "+marks.length);
		System.out.println("first element of the array is "+marks[0]);
		System.out.println("last element of the array is "+marks[marks.length-1]);
		
		System.out.println("**************************************");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total number of students");
		int n=sc.nextInt();
		
		int marks2[]= new int[n]; //declare the array and allocate memory of size n
		System.out.println("enter the elements in marks2");
		for (int i = 0; i < marks2.length; i++) {
			marks2[i]=sc.nextInt();
		}
		
		
		System.out.println("content of the second array");
		for (int j = 0; j < marks2.length; j++) {
			System.out.print(marks2[j]+"\t");
		}
		
		System.out.println();
		System.out.println("display marks array without loop");
		System.out.println(Arrays.toString(marks));
		
		sc.close();

	}

}
