package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 11:41:56 AM
* project: Corejava
*/

public class Student {
	private int rollNo;
    private String name;
    private static  String college="UPES"; //static Variable
    
    public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public static void collegeChange(){ //static Method
        college="VTU";
    }
    public void display(){
        System.out.println(this.rollNo+" "+this.name+" "+college);
    }
}
