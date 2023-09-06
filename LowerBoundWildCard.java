package EY2208;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(123);
		listInt.add(456);
		listInt.add(689);
		printListItem(listInt);
		
		List<Number> listFloat = new ArrayList<Number>();
		listFloat.add(14L);
		listFloat.add(3.14f);
		listFloat.add(21L);
		printListItem(listFloat);
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(11.2D);
		listDouble.add(3.14D);
		listDouble.add(21D);
		//printListItem(listDouble);
	}
	
	static void printListItem(List<? super Integer> list) {
		for(Object num:list) {
			System.out.println(num);
		}
	}

}
