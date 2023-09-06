package EY1408;

public class L2 {

	public static void main(String[] args) {
		String str= new String("ABC");
		System.out.println("1-The value of str is " +str);
		str.concat("XYZ");
		System.out.println("2-The value of str is " +str);
        str.replace("A","Y");
        System.out.println("3-the value of str is " +str);
        
        StringBuffer str1= new StringBuffer("ABC");
		System.out.println("4-The value of str is " +str1);
		str1.append("XYZ");
		System.out.println("5-The value of str is " +str1);
		
		StringBuilder str2= new StringBuilder("ABC");
		System.out.println("6-The value of str is " +str2);
		str2.append("XYZ");
		System.out.println("7-The value of str is " +str2);
	}

}


