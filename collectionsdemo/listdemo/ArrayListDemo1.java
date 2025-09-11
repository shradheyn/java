package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 10:22:04 AM
* project: Corejava
*/

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> p1=new ArrayList<String>();
		
		p1.add("java");
		p1.add("PERL");
		p1.add("C# 5.0");
		p1.add("java");
		p1.add("Python");
		
		//display the array list
		System.out.println("programming language arraylist: "+p1);
		
		//access elements using get() method
		System.out.println("element as index 1 is: "+p1.get(1));
		System.out.println("does array contain element java? "+p1.contains("java"));
		
		
		//add elements at a specific index
		p1.add(2,"oracle");
		System.out.println("programming language arraylist: "+p1);
		
		System.out.println("is array list empty?"+p1.isEmpty());
		System.out.println("the position of python: "+p1.indexOf("Python"));
		System.out.println("the size of the arraylist is "+p1.size());
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(89); //autoboxing convert primitive type to object
		marks.add(45);
		marks.add(68);
		marks.add(94);
		marks.add(75);
		//marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);
		
	}
}
