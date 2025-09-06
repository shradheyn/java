package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 4:19:27 PM
* project: Corejava
*/

public class Nurse extends Hospitalstaff {
	private int patientLoad;
	
	public Nurse(String name, String id, String department, int patientLoad) {
		super(name, id, department);
		this.patientLoad = patientLoad;
	}

	 @Override
	 public void performDuties() {
		 System.out.println(getName() + " is caring for " + patientLoad + 
                 " patients in the " + getDepartment() + " department.");
		
	 }
	  public void administerMedication() {
	        System.out.println(getName() + " is administering medication to patients.");
	    }
	 
	
}


	


