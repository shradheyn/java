package oopsdemo1;

import java.util.Scanner;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 10:02:57 AM
* project: Corejava
*/

public class Booktest {

	public static void main(String[] args) {
		Book b1= new Book();
		
		//invoke setter methods
		b1.setBookId(101);
		b1.setBookName("PROGRAMMING WITH C");
		b1.setPrice(500);
		b1.setPublisher("primebooks");
		
		//invoke getter methods
		System.out.println("*****book details*****");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("discounted price of book: "+b1.discountPrice());
		
		System.out.println(b1); // if we comment the to string method in book this will display the address of the object
		
		Book b2= new Book();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the book id name price and publisher");
		b2.setBookId(sc.nextInt());
		sc.nextLine();
		b2.setBookName(sc.nextLine());
		b2.setPrice(sc.nextFloat());
		sc.nextLine();
		b2.setPublisher(sc.nextLine());
		sc.close();
		
		System.out.println("*****book details*****");
		b2.display();
		System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
		System.out.println("discounted price of book: "+b2.discountPrice());
		
		System.out.println(b2);
	}

}
