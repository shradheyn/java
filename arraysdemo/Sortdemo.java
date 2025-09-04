package arraysdemo;

import java.util.Arrays;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 10:40:22 AM
* project: Corejava
*/

public class Sortdemo {

	public static void main(String[] args) {
		String[] lanaguages ={"Java","Ruby","Python","C++","Scala","Oak","C"};
        String[] lanaguages1 ={"Java","Ruby","Python","C++","Scala","Oak","C"};

        System.out.println("Original Array : "+ Arrays.toString(lanaguages));
        Arrays.sort(lanaguages); //Inbuilt function of Arrays
        System.out.println("Sorted Array : "+ Arrays.toString(lanaguages));

        //Partial Sort
        Arrays.sort(lanaguages1,2,lanaguages1.length);
        System.out.println("Array after Partial Sorting :");
        for(String x:lanaguages1){
            System.out.print(x+"\t");
        }

	}

}
