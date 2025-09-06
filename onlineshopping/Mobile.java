package onlineshopping;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 12:01:36 PM
* project: Corejava
*/

//Concrete Product - Mobile
class Mobile extends Product {
 public Mobile(String productName, double price) {
     super(productName, price);
 }

 @Override
 public void showProductDetails() {
     System.out.println("Mobile: " + productName + " | Price: ₹" + price);
 }
}