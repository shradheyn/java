package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 10:02:51 AM
* project: Corejava
*/

public class Shapetest {

	public static void main(String[] args) {
		//programming for interfaces not implementation
				Shape shape=new Circle(10); // Upcasting
				
				System.out.println("Using Interface :"+Shape.LABEL);
				
				shape.draw();
				
				System.out.println("Area of Circle with radius  is :"+shape.getArea());
				
				//switching from one implementation to another easily
				shape=new Rectangle(10,7); // Upcasting
				
				shape.draw();
				System.out.println("Area of Rectangle is :"+shape.getArea());

	}

}
