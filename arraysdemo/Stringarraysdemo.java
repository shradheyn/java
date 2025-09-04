package arraysdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 2, 2025
* time: 10:24:03 AM
* project: Corejava
* Program to display whether each student in class, excluding Lucy,
* has passed their recent test
*/

public class Stringarraysdemo {

	public static void main(String[] args) {
		String[] students={"Mark","Bill","Lucy","James","Chloe"};
        int grades[]={34,75,0,40,80};

        System.out.println("********** The Student List *************");
        for(String i:students){
            System.out.println(i);
        }

        // Traverse in Array
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals("Lucy")){
                continue;
            }
            if(grades[i] >=35){
                System.out.println(students[i]+" has Passed Test with Grade :"+grades[i]);
            }else{
                System.out.println(students[i]+" has Failed Test with Grade :"+grades[i]);
            }
        }

	}

}
