package oopsdemo4;

/**
 * author: Shradhey.Naudiyal
 * date: Sep 6, 2025
 * time: 11:28:36 AM
 * project: Corejava
 */
//multiple Interface implementation - multiple inheritance
//StudentDetails class implements abstract methods of 2 Interfaces

public class Studentdetails implements Collegedata, HostelData {


	College c1=new College("Mary",500,"Delhi University","MCA");

	Hostel h1=new Hostel("Ram","Block A");

			@Override
			public void hostelDetail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void studentRecord() {
		System.out.println("Students Selected based on Percentage & Financial Condition");
	}

	@Override
	public void collegeDetail() {
		 System.out.println("********** College Details *********");
			System.out.println("College Name : "+c1.getName());
			System.out.println("College Id   : "+c1.getId());
		//	System.out.println("Course       : "+c1.getCourse());
			System.out.println("University   : "+c1.getUniversty());
	    

	}

	@Override
	public void studentData() {
		System.out.println("Students can Join courses : MCA, MTech, BCA,BTech");
	}
}
