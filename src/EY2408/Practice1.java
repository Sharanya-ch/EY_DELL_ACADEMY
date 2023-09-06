package EY2408;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCDEFGH";
		String str1 = str.substring(0,3);
		StringBuilder obj = new StringBuilder(str1);
		r= obj.reverse();	
		str.concat(obj);
		System.out.println(str);
		
			
	}}
		

