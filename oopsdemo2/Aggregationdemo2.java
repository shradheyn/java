package oopsdemo2;

/**
* author: Shradhey.Naudiyal
* date: Sep 4, 2025
* time: 12:13:32 PM
* project: Corejava
*/

public class Aggregationdemo2 {

	public static void main(String[] args) {
		Author author = new Author("John", 42, "USA"); 
		
	    Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");
	    
	    Book b = new Book("Java for Beginners", 800, author, publisher);
	    
	    b.display();
	}

}
