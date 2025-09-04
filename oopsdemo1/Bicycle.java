package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 10:44:12 AM
* project: Corejava
*/

public class Bicycle {
	int gear;
	
	void applybrake() {
		System.out.println("applying brakes grrrrrrr");
	}
	
	public void startcycling(){
		gear=gear+1;
		System.out.println("cycling in gear number "+gear);
	}
	public static void main(String[] args) {
		Bicycle sp= new Bicycle();
		
		sp.startcycling();
		sp.startcycling();
		sp.startcycling();
		sp.applybrake();
		

	}

}
