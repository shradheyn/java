package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 11:43:19 AM
* project: Corejava
*/

public class Staticdemo2 {
	public static void main(String[] args) {
		 //Invoke static Method even before creating Object
        Student.collegeChange();

        Student s1=new Student(101,"Mike");
        Student s2=new Student(102,"John");
        Student s3=new Student(103,"Mary");

        s1.display();
        s2.display();
        s3.display();
	}
}
