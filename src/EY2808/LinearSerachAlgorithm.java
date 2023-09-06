package EY2808;

import java.util.Arrays;

public class LinearSerachAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {10,9,8,0,7,6,5};
		int LengthOfArray = intArr.length;
		
		int searchElement = 0;
		int index = searchProgram(intArr, LengthOfArray, searchElement);
		if(index == -1) {
			System.out.println("Element " + searchElement + " is not " + "present in array "+ Arrays.toString(intArr));
		}else {
			System.out.println("Element " + searchElement + " found" + " at index " + index );
		}

	}

	 static int searchProgram(int[] intArr, int LengthOfArray, int searchElement) {
		 for(int i =0; i < LengthOfArray; i++) {
	            if(intArr[i]==searchElement) {
	                return i;

	}
	 }return -1;
	 }}
