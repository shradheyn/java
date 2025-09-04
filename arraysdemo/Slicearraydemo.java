package arraysdemo;

import java.util.Arrays;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 11:27:12 AM
* project: Corejava
*/

public class Slicearraydemo {

	static void display() {
		System.out.println("array manipulation in   java- slice array");
	}
	
	static void slicearray(int[] marks,int start,int end) {
		int slicemarks[]= new int[end-start];
		for (int i = 0; i < slicemarks.length; i++) {
			slicemarks[i]=marks[start+i];
		} 
		System.out.println("sliced array from"+start+" to "+(end-1)+" is "+Arrays.toString(slicemarks));
	}
	public static void main(String[] args) {
		
		display();
		
		  int[] marks={78,56,23,44,90,98,67,55,35,84};
	        int start=2,end=6;

	        System.out.println("Original Array : "+ Arrays.toString(marks));
	        slicearray(marks,start,end+1); // Invoke sliceArray() method

	        int [] grades={99,44,31,78,49,55,39,21,30,92,66,44};
	        int start1=4,end1=8;
	        System.out.println("Original Array : "+ Arrays.toString(grades));
	        slicearray(grades,start1,end1+1); // Invoke sliceArray() method again - reusability

	        //Use inbuilt method copyOfRange() to slice Array
	        int[] sliceGrades=Arrays.copyOfRange(grades,8,11);
	        System.out.println("The grades Array after slicing from 8 -11 index : "+Arrays.toString(sliceGrades));

	}

}
