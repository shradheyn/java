package controlflow;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 1, 2025
* time: 10:37:27 AM
* project: Corejava
* Program to enter RollNumber, Name, Marks of 5 Subjects of a Student & calculate
* the Aggregate Marks & Display the Result.
*/

public class Studentresult {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int rollNumber;
        String name;
        float marks1,marks2,marks3,marks4,marks5,total,agg;

        System.out.println("********** Enter Student Details ***************");
        System.out.println("Enter Student Roll Number   : ");
        rollNumber=scanner.nextInt();
        System.out.println("Enter Student Name          :");
        name=scanner.next();
        System.out.println("Enter Marks of 5 Subjects   :");
        marks1=scanner.nextInt();
        marks2=scanner.nextInt();
        marks3=scanner.nextInt();
        marks4=scanner.nextInt();
        marks5=scanner.nextInt();
        scanner.close();
        if(marks1<0 || marks2<0 || marks3<0 || marks4<0 || marks5 <0) {
        	System.out.println("please fill valid marks");
        	return ;
        }
        total=marks1+marks2+marks3+marks4+marks5;
        agg=(100*total)/500;

        System.out.println("************* Student Result *******************");
        System.out.println("Roll Number                 :"+rollNumber);
        System.out.println("Student Name                :"+name);
        System.out.println("Total Marks                 :"+total);
        System.out.println("Aggregate                   :"+agg);
        
        if (agg>=85) {
			System.out.println("result                  : distinction ");
		} else if(agg>=60){
			System.out.println("result                  : first class ");
		}else if(agg>=50) {
			System.out.println("result                  : second class ");
		}else if(agg>=35) {
			System.out.println("result                  : pass class ");
		}else {
			System.out.println("result                  : fail ");

		}

	}

}
