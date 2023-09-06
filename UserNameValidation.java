package EY2508;

import java.util.regex.Pattern;

public class UserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","acd123"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd3467"));//false
		
		
		//mobile number
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","7702433487"));//true
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}","3702433487"));//false
		
		
		//trim function is only used to remove leading and trailing
		//white space in string whereas with replace, and you can remove
		//white spaces from within
		String str = "    Java Example Trim    Function     ";
		System.out.println(str.trim());

	}

}
