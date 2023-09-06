package EY2108;

public class Book {
	
	int bookId;
	String author, publisher,name;
	int quantity;
	
	//Constructor
	Book(int bookId, String publisher, String author, String name, int quantity){
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
		this.quantity = quantity;
	}

}
