package EY2208;

public class GeneralizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] intArr = {10,20,30,40,56};
		String[] strArr = {"Z","A","G","T","L"};
		
		System.out.println("Printing Integer Array");
		printArray(intArr);
		
		System.out.println("Printing String Array");
		printArray(strArr);
	}
	
	static <E> void printArray(E[] elements) {
		for(E ele:elements) {
			System.out.print(ele +" ");
		}
		System.out.println();
	}

}
