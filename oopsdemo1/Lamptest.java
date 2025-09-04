package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 10:33:41 AM
* project: Corejava
*program of instance class and main class in a single file 
*/
class Lamp{
	// stores the value for light
	  // true if light is on
	  // false if light is off
	boolean isOn;
	
	void turnOn() {
		isOn=true;
		System.out.println("lights on?"+isOn);
	}
	
	//method toturn off the light
	void turnOff() {
		isOn=false;
		System.out.println("lights on?"+isOn);
	}	
}

public class Lamptest {

	public static void main(String[] args) {
		//create object led & ghalogen
		Lamp led= new Lamp();
		Lamp halogen=new Lamp();
		
		//switch on led and halogen
		led.turnOn();
		halogen.turnOn();
		
		//switch off led and halogen
		led.turnOff();
		halogen.turnOff();
	}

}
