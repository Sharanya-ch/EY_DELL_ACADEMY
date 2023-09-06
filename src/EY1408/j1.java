package EY1408;

public class j1 {

	public static void main(String[] args) {
		char[] char1 = {'Z', 'c', 'l', 'i','o','d','e'};
		char[] char2 = new char[3];
		
		
		System.arraycopy(char1, 2 , char2, 0, 3);
		//System.out.println(Arrays.toString(char2));
		System.out.println(new String(char2));
		
		
		
	}

}
