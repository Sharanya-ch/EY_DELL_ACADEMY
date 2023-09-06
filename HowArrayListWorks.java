package EY2108;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {

	public static void main(String[] args) {

		// insertion order is maintained
		// duplicates are allowed
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		// any number of null is allowed
		arrList.add(null);
		arrList.add(null);
		arrList.add(null);
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList.add("P");
		arrList.add("P");
		// adding second array list in the first array list
		arrList.addAll(arrList2);
		// size of the array list
		System.out.println("Size of the arraylist is " + arrList.size());
        //removing first element
		arrList.remove("A");

		// updating the element at first index of arraylist
		arrList.set(1, "New second element");

		// removing all first array list elements and reaining only second arraylist
		// elements
		arrList.retainAll(arrList2);

		arrList.add("L");
		arrList.add("X");
		arrList.add("Y");

		Iterator<String> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");

	    // In the end you clear the entire array list like
			arrList.clear();
			
			//You can print your array list like this also
			for(String str: arrList) {
				System.out.println(str + " ");
			}
		}
	}

}
