package EY2108;

import java.util.Map;
import java.util.TreeMap;

public class HashMapForCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try with hash map, linkedhash map and tree map
		TreeMap<Integer, Book> hMap = new TreeMap<>();
		
		Book b1= new Book(1,"A","B","C",10);
		Book b2 = new Book(12, "P","A","D", 99);
		Book b3 = new Book(22, "G","H","I",66);
		
		hMap.put(123, b3);
		hMap.put(135, b2);
		hMap.put(121, b3);
		
		for(Map.Entry<Integer, Book> m:hMap.entrySet()) {
			int key = m.getKey();
			Book b= m.getValue();
			System.out.println("Key" + "details are : ");
			System.out.println(b.bookId + " "+ b.name + " " + b.publisher + " " + b.author +" " + b.quantity);
			
		}

	}

}
