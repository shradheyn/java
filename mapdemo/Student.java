package mapdemo;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 4:12:09 PM
* project: Corejava
*/
//java comparable interface is used to order the objects of user defined class
//it provides single sorting sequence only
public class Student implements Comparable<Student> {
	protected int rollno;
	protected String name;
	protected int age;
	
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		if (age==st.age) {
			return 0;					
		} else if(age>st.age) {
			return 1;
		}else {
			return -1;
		}
	}

	
	
	
	
}
