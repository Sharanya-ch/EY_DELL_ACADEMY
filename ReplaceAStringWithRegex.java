package EY2508;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAStringWithRegex {		// TODO Auto-generated method stub
		
		private static final String REGEX = "Java";
		private static String INPUT_STRING = "Core Java programming language";
		private static final String REPLACED_STRING = "Java Regex concept";
		
		public static void main(String[] args) {
			Pattern p = Pattern.compile(REGEX);
			Matcher m = p.matcher(INPUT_STRING);
			INPUT_STRING = m.replaceAll(REPLACED_STRING);
			System.out.println("Replaced string is - " + INPUT_STRING);
		
	
	}

}
