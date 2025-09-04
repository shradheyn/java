package oopsdemo1;

/**
* author: Shradhey.Naudiyal
* date: Sep 3, 2025
* time: 9:49:49 AM
* project: Corejava
* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:
   declare class variables/attributes as private
   provide public get and set methods to access and update the value of a private variable
   
   The get method returns the value of the variable name.

   The set method takes a parameter (newName) and assigns it to the name variable. 
*/

public class Book {
	private int bookId;
	private String bookName;
	private float price;
	private String publisher;
	public int getBookId() {
		return bookId;
	}
	// Generate Getters & Setters -> Place a cursor in new blank line --> 
	//Click Source menu ---> Generate Getters & Setters --> Select All --> Generate
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	void display() {
		System.out.println("******welcome tolibrary*******");
	}
	float discountPrice() {
		return((this.price)-(this.price*.10f));
	}
	//generate toString() method -- convert object into string
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher=" + publisher
				+ "]";
	}
	
	
	
	 
	
}
