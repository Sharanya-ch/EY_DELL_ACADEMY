package EY2808;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {2,3,4,5,6,7,8};
		System.out.println("Array before swaping : ");
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		//let say we want to swap element at 5th index with 2nd index
		int firstIndex = 2, secondIndex=5;
		
		//temp variable
		int temp = intArr[firstIndex];
		
		//swapping
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;
		System.out.println();
		System.out.println("Array after swapping 5th with 2nd: ");
		for(int i:intArr) {
			System.out.print(i + " ");
		}
	}

}
