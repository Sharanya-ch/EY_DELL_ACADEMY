package EY2508;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWithQuantifier {
	//*zero or more than once
	private static final String REGEX = "a*h";
	private static final String INPUT_STRING = "aahCCabdEEfggh";
	private static final String REPLACE = "-";
	
	public static void main(String[] args) {
		Pattern p  = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			//append and replace
			m.appendReplacement(sb, REPLACE);
		}
		System.out.println(sb.toString());
	}
}
