package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 4:17:07 PM
* project: Corejava
*/

public abstract class Hospitalstaff {
	//Abstract class representing a general Hospital Staff member


	private String name;
	    private String id;
	    private String department;
	    
	    
	    
	     public Hospitalstaff(String name, String id, String department) {
			this.name = name;
			this.id = id;
			this.department = department;
		}
	     
	     
		 public String getName() {
			return name;
		}


		 public String getId() {
			 return id;
		 }


		 public String getDepartment() {
			 return department;
		 }


		// Abstract method - must be implemented by subclasses
	    public abstract void performDuties();

	    // Concrete method - shared by all subclasses
	    public void attendMeeting() {
	        System.out.println(name + " is attending a hospital meeting.");
	    }
}
