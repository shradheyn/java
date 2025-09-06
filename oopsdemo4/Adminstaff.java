package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 4:26:25 PM
* project: Corejava
*/

public class Adminstaff extends Hospitalstaff {
	private String role;

	public Adminstaff(String name, String id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}

	@Override
	public void performDuties() {
		System.out.println(getName() + " is performing " + role + 
                " tasks in the " + getDepartment() + " department.");	
		
	}
	  public void processPaperwork() {
	        System.out.println(getName() + " is processing hospital paperwork.");
	    }
	
}
