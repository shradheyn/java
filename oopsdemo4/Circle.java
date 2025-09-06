package oopsdemo4;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 9:55:29 AM
* project: Corejava
*/

public class Circle implements Shape{
	 private double radius;
		
		public Circle(double radius) {
			this.radius = radius;
		}

		@Override
		public void draw() {
			System.out.println("Drawing circle");
		}

		@Override
		public double getArea() {
			return Math.PI * Math.pow(this.radius, 2);
		}

		public double getRadius() {
			return radius;
		}
		

}
