package oopsdemo3;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 3:01:01 PM
* project: Corejava
*/

public class Overloaddemo2 {
	public static void main(String[] args) {
		 Outlet oulet=new Outlet();
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name & price
	        oulet.addProduct("T-Shirt",20.50);
	         //oulet.addProduct("T-Shirt",20.50);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name ,price, quantity
	        oulet.addProduct("Jeans",45.50,100);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name , price, quantity, category
	        oulet.addProduct("Sneakers",75.50,30,"Footwear");
	        System.out.println("---------------------------------------------");
	}
}
