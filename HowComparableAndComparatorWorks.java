package EY2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowComparableAndComparatorWorks {
	
	

	
	public static void main(String[] args) {
		int[] intArr = {10,23,82,93,103,11,34,3};
		Arrays.sort(intArr);
		System.out.println("Sorted Integer Array is " + Arrays.toString(intArr));
		
		String[] strArr = {"A","V","C","L"};
		Arrays.sort(strArr);
		System.out.println("Sorted String Array is " + Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z");listStr.add("Y");listStr.add("X");listStr.add("W");listStr.add("V");
		listStr.add("U");listStr.add("A");
		Collections.sort(listStr);
		for(String str:listStr) {
			System.out.print(str + " ");
		}
		
		
		

		
		
		

	}

}
