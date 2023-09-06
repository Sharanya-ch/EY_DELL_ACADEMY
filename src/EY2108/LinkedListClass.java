package EY2108;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");list.add("A");list.add("A");list.add("A");
		
		//any number of null is allowed
		list.add(null);list.add(null);
		
		list.add("Z");list.add("X");list.add("Y");list.add("P");
		
		list.addFirst(" first element");
		list.addLast("Last element");
		
		
		Object firstElement = list.getFirst();
		System.out.println("First element is  "+ firstElement);
		
		Object lastElement = list.getLast();
		System.out.println("Last element is  "+ lastElement);
		
		int position = list.indexOf("Z");
		System.out.println("position of Z  is  "+ position);
		
		int lastPositionOfA = list.lastIndexOf("A");
		System.out.println("position of last A  is  "+ lastPositionOfA);
		
		list.removeFirst();
		list.removeLast();
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		
		Object o = list.poll();
		Object o2 = list.pollLast();
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
			
			
			
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.print(listItr.next() + " ");
		}
		
		System.out.println();	
			
		while(listItr.hasPrevious()) {
			System.out.print(listItr.previous() + " ");
			
		}

		}
	}}
