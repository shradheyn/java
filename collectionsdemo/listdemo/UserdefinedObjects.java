package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.List;

/**
* author: Shradhey.Naudiyal
* date: Sep 9, 2025
* time: 11:38:48 AM
* project: Corejava
*/
//Program to store user defined Objects in collections
public class UserdefinedObjects {

	public static void main(String[] args) {
		 //Creating Books  object & initialized using Book Constructor
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		 
		 //crating a list books
		 List<Book> blist= new ArrayList<Book>();
		 
		 //adding books to the list
		 blist.add(b1);
		 blist.add(b2);
		 blist.add(b3);
		 
		 //traverse the list
		 System.out.println("****************book list**************");
		 for (Book i : blist) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAuthor()+" "+i.getPublisher()+" "+i.getQuantity());
		}
		 System.out.println("total number of books: "+blist.size());
	}

}
