package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 5, 2025
* time: 9:37:52 AM
* project: Corejava
*/

public class Product {
	private String name;
	private double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	void display() {
        System.out.println("********** Product Details ***************");
        System.out.println("Name : "+name);
        System.out.println("Price: "+price);
    }
}

class Book extends Product{
	
	private String author;

	public Book(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	void display() {
        super.display();
        System.out.println("author: "+author);
    }	
}

class Laptop extends Product{
	private String manufacturer;

	public Laptop(String name, double price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Manufacturer: "+manufacturer);
	}
	
}

