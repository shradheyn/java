package onlineshopping;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 12:01:08 PM
* project: Corejava
*/

//Concrete Product - Laptop
class Laptop extends Product {
 public Laptop(String productName, double price) {
     super(productName, price);
 }

 @Override
 public void showProductDetails() {
     System.out.println("Laptop: " + productName + " | Price: ₹" + price);
 }
}
