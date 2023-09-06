package EY2108;

import java.util.Hashtable;
import java.util.Map;

public class HashTableC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> hmap = new Hashtable<>();
		hmap.put(123,"ABC");
		hmap.put(135, "MNO");
		
		hmap.remove(135);
		
		for(Map.Entry<Integer, String> m: hmap.entrySet()) {
			System.out.println(m.getKey() + ": " +m.getValue());
		}

	}

}
