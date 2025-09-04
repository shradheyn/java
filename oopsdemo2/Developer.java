package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 4:21:42 PM
* project: Corejava
*/

public class Developer extends Employee{
	
	private String skillSet;
	private String projectName;
	
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name);
		this.skillSet = skillSet;
		this.projectName = projectName;
	}
	
	// method to display developer details
		public void displayDeveloperDetails() {
			// call parent class method
			
			System.out.println("Skill Set: " + skillSet);
			System.out.println("Project Name: " + projectName);
		}
}
