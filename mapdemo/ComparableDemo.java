package mapdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 4:19:51 PM
* project: Corejava
*/

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student>al= new ArrayList<Student>();
		al.add(new Student(111, "john", 29));
		al.add(new Student(222, "mike", 21));
		al.add(new Student(555, "mary", 26));
		
		for (Student s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		Collections.sort(al);
		System.out.println("********After sorting**********");
		for (Student st : al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}


	}

}
