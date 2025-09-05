package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 11:32:19 AM
* project: Corejava
*/
class Count{
	private static int cnt;
	private int a;
	
	public Count() {
		cnt++;
		a=100;
	}
	public static void display() {
		System.out.println("thenumber of objects created "+cnt);
		//a=a+10;
	}
	
	 public void print(){
	        System.out.println("Instance Method Variable : "+a);
	    }
}
public class Staticdemo {
	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		
		c1.print();
		Count.display();
	}
}
