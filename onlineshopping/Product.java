package onlineshopping;

/**
* author: Shradhey.Naudiyal
* date: Sep 6, 2025
* time: 12:00:07 PM
* project: Corejava
*/

public abstract class Product {
     String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public abstract void showProductDetails();
}

