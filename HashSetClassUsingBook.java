package EY2108;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetClassUsingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			
			HashSet<Book> hset = new HashSet<>();
			
			Book b1 = new Book(1, "A","B","C", 10);
			Book b2 = new Book(12, "P","Q","R", 100);
			Book b3 = new Book(32, "M", "N", "O", 1800);
			
			hset.add(b1);hset.add(b1);hset.add(b2);
			hset.add(b2);hset.add(b3);hset.add(b3);
			
			//hset.add("X");hset.add("A");hset.add("Y");hset.add("B");
			
			Iterator<Book> itr = hset.iterator();
			while(itr.hasNext()) {
				
				Book b =itr.next();
				System.out.println(b.bookId + " " + b.name + " "+ b.publisher + " " + b.author +" "+ b.quantity);
				//it gets printed in random order
			}
			

		}

	}


