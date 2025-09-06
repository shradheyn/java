package onlineshopping;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 12:05:51 PM
* project: Corejava
*/
/*
Shopping System with:

Abstract Class (Product) → base for all products.

Concrete Products (Laptop, Mobile) extending Product.

Interfaces (OnlinePayment, Discount) → for payment & discount behaviors.

ShoppingCart → manages multiple products, applies discounts, and makes payments.
*/
//Main Class
public class ShoppingDemo {
 public static void main(String[] args) {
     // Customer's Shopping Cart
     ShoppingCart cart = new ShoppingCart("Rohit");

     // Adding Products
     cart.addProduct(new Laptop("Dell XPS 15", 85000));
     cart.addProduct(new Mobile("iPhone 15", 120000));

     // Show cart
     cart.showCartDetails();

     // Apply discount
     double finalAmount = cart.applyDiscount(cart.getTotalAmount());

     // Make payment
     cart.payOnline(finalAmount);
     
     System.out.println("**********************************");
     ShoppingCart cart1 = new ShoppingCart("monica");

     // Adding Products
     cart1.addProduct(new Laptop("Samsung galaxy s23", 70000));
 
     // Show cart
     cart1.showCartDetails();

     // Apply discount
     double finalAmount1 = cart.applyDiscount(cart.getTotalAmount());
     cart1.payOnline(finalAmount1);

 }
}
