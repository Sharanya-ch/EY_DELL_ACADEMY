package EY2108;

import java.util.*;
//import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(123, "ABC");
		hMap.put(123, null);//second record with same key will override he first record
		hMap.put(121, null);
		hMap.put(null, "MNO");
		hMap.put(123, "XYZ");
		hMap.put(823, "PQR");
		
		
		//This is how we traverse map
		for(Map.Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		

	}

}
