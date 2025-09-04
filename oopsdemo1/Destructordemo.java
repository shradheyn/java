package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 3:09:24 PM
* project: Corejava
*/
class Test{
	public void finalize() {
		System.out.println("destroyed wowww very dangerous");
	}
}
public class Destructordemo {
	public static void main(String[] args) {
		Test t1= new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		
		t1=null;
		t2=null;
		t3=null;
		
		System.gc();
		System.out.println("in main method");
	}
}
