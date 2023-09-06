package EY2408;

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("ABC");
		System.out.println("first step - " +str);
		str =str.concat("SSS");
		System.out.println("Second step - " +str);
		
		StringBuilder sr = new StringBuilder("ABC");
		System.out.println("first step - " +sr);
		sr.append("SSS");
		System.out.println("Second step - " +sr);
		
	}

}
