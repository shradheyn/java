package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 12:24:29 PM
* project: Corejava
* Program to add 2 complex numbers- Real & Imaginary part


*/

public class Complex {

	private double real;
	private double imaginary;
	
	// Generate Constructor using fields
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) {
		this.real += obj.real;
		this.imaginary += obj.imaginary;
	}
	
	public void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	} 
}
