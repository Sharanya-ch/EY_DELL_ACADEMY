package EY2108;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookclass {
	
	public static void main(String[] args) {
		ArrayList<Book> arrList = new ArrayList<>();
		
		
		Book b1 = new Book(1, "A","B","C", 10);
		Book b2 = new Book(12, "P","Q","R", 100);
		Book b3 = new Book(32, "M", "N", "O", 1800);
		
		arrList.add(b1);arrList.add(b2);arrList.add(b3);
		//arrList.add(b2);arrList.add(b3);arrList.add(b3);
		
		for(Book b: arrList) {
			System.out.println(b.bookId + " " + b.name + " "+ b.publisher + " " + b.author +" "+ b.quantity);
			
		}
		Iterator<Book> itr = arrList.iterator();
		while(itr.hasNext()) {
			Book b =itr.next();
			System.out.println(b.bookId + " " + b.name + " "+ b.publisher + " " + b.author +" "+ b.quantity);
			System.out.println()
			
			;

		}
	
	
	
	
	}


}
