package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import arraysdemo.Arrayupdatedemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 11:31:25 AM
* project: Corejava
*/

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("jamers");
		names.add("michael");
		names.add("andy");
		names.add("jim");
		names.add("robert");

		
		System.out.println(names);

        System.out.println("*** Display Collection using Iterator ***");
        // Iterator Interface for traversing
        Iterator<String> itr=names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //manipulations
        names.add(3,"Raj"); //Add element at specified index
        names.remove(0); // Delete first Element
        names.set(1,"Java"); //replace existing element

        System.out.println("*** Display Collection using ForEach Loop ***");
        for(String i:names){
            System.out.println(i);
        }

        ArrayList<Double> marks=new ArrayList<Double>();
        marks.add(999.45);
        marks.add(500.20);
        marks.add(768.25);
        marks.add(871.90);
        marks.add(450.45);

        System.out.println("**** Display Collections using Classic For Loop ***********");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }

        Collections.sort(marks); // Collections is a Utility class for perform Utility functions
        System.out.println(marks);
		
		
		

	}

}
