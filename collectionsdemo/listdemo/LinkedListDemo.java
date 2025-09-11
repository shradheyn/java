package collectionsdemo.listdemo;

import java.util.Collections;
import java.util.LinkedList;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 12:00:44 PM
* project: Corejava
*/

public class LinkedListDemo {
	public static void main(String[] args) {
		//Use linked list for more Insert & remove operations


		 LinkedList<Double> stockPrices=new LinkedList<>();

		        //Linked list containing stock prices of a company for last 6 days
		        stockPrices.add(45.00);
		        stockPrices.add(51.00);
		        stockPrices.add(62.50);
		        stockPrices.add(42.75);
		        stockPrices.add(36.80);
		        stockPrices.add(69.40);

		        System.out.println(stockPrices);

		        //Collections Utility Class functions
		        Collections.sort(stockPrices);
		        System.out.println("Stock Prices after Sorting : "+stockPrices);

		        Collections.reverse(stockPrices);
		        System.out.println("Stock Prices Reversed :"+stockPrices);

		        System.out.println("Maximum Stock Price :"+Collections.max(stockPrices));
		        System.out.println("Minimum Stock Price :"+Collections.min(stockPrices));
	}

}
