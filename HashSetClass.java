package EY2108;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		hset.add("Z");hset.add("Z");hset.add("Z");hset.add("Z");
		
		hset.add(null);hset.add(null);hset.add(null);hset.add(null);
		
		hset.add("X");hset.add("A");hset.add("Y");hset.add("B");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		
		}
		

	}

}
