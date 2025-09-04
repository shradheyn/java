package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 12:09:24 PM
* project: Corejava
* In Java, aggregation represents HAS-A relationship, 
 * which means when a class contains reference of another class known to have aggregation.
 * 
 * When you want to use some property or behavior of any class without the requirement of modifying it 
 * or adding more functionality to it, in such case Aggregation 
*/

public class Book {
	private String name;
	private int price;
		
		//Aggregation
		Author author;
		Publisher publisher;
	
		public Book(String name, int price, Author author, Publisher publisher) {
			this.name = name;
			this.price = price;
			this.author = author;
			this.publisher = publisher;
		}

		void display()
		{
			System.out.println("*************** Book Details ****************");
			System.out.println("Book Name    : "+name);
		    System.out.println("Book Price   : "+price);
		    
		    System.out.println("------------Author Details----------");
		    System.out.println("Author Name  : "+author.authorName);
		    System.out.println("Author Age   : "+author.age);
		    System.out.println("Author place : "+author.place);
		    
		    System.out.println("------------Publisher Details-------");
		    System.out.println("Publisher Name: "+publisher.name);
		    System.out.println("Publisher ID  : "+publisher.publisherID);
		    System.out.println("Publisher City: "+publisher.city);
		    
		}
}
