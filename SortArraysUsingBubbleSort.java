package EY2808;

public class SortArraysUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {3,60,35,7,22,6,719};
		
		System.out.println("Before bubble sort: ");
		for(int i = 0;i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		bubbleSort(intArr);
		System.out.println();
		
		System.out.println("After bubble sort: ");
		for(int i = 0;i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
	static void bubbleSort(int[]  intArr) {
		int lengthOfArray = intArr.length;
		int tempArr = 0;
		for(int i =0; i<lengthOfArray;i++) {
			for(int j=1; j<(lengthOfArray - i); j++) {
				if(intArr[j-1]>intArr[j]) {
					//swap the elements bro
					tempArr= intArr[j-1];
					intArr[j-1] = intArr[j];
					intArr[j] = tempArr;
				}
			}
			
		}
	}

}
