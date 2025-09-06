package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 4:22:11 PM
* project: Corejava
*/

public class Doctor extends Hospitalstaff {
	 private String specialization;
	 
	 public Doctor(String name, String id, String department, String specialization) {
			super(name, id, department);
			this.specialization = specialization;
		}
	 
	 @Override
	 public void performDuties() {
		  System.out.println(getName() + " is examining patients in the " + 
	                 getDepartment() + " department (" + specialization + ").");
		
	  }                     
	  public void prescribeMedication() {
		        System.out.println(getName() + " is writing a prescription.");
		    }
}
