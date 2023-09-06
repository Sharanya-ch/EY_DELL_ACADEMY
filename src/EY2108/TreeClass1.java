package EY2108;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeClass1 {
	

		public static void main(String[] args) {
			
			TreeSet<String> hset = new TreeSet<>();
			hset.add("Z");hset.add("Z");hset.add("Z");hset.add("Z");
			
			//hset.add(null);hset.add(null);hset.add(null);hset.add(null);
			
			hset.add("X");hset.add("A");hset.add("Y");hset.add("B");
			
			Iterator<String> itr = hset.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			
			}
			

	
	}


}
