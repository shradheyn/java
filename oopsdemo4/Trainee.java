package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 12:50:18 PM
* project: Corejava
*/

public abstract class Trainee {
	 private String name;
	   private String address;
	   private int number;
   
   
   public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	   //abstract method declaration - must be overridden in the derived class
	   public abstract double calculatemarks();
   
   void show()
	{
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}

   @Override
   public String toString() {
	return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
   }
   
   
}
