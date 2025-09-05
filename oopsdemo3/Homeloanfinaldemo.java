package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 12:10:18 PM
* project: Corejava
*/

public class Homeloanfinaldemo {

	public static void main(String[] args) {
		//using rbi rules
		RBI rbi=new RBI();
		rbi.showRBIGuidelines();
		
		//creating customer home loans
		Homeloan loan1= new Homeloan("alice", 3000000, 10000);
		Homeloan loan2= new Homeloan("bob", 5000000, 15000);
		
		loan1.showLoanDetails();
		System.out.println("_______________");
		loan2.showLoanDetails();
		 // ❌ ERROR if you try to modify final variable
        // RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
        // loan1.PROCESSING_FEE = 20000;  // Not allowed

	}

}
