package EY2508;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexWayOfDefiningPatternAndMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(".o");
		
		Matcher m = p.matcher("Co");
		boolean result = m.matches();
		
		System.out.println("Match result - " + result);
		
		boolean sameResult2 = Pattern.compile(".a").matcher("pai").matches();
		System.out.println("Result is " +sameResult2);
		
		boolean sameResult3 = Pattern.matches(".q", "Pq");
		System.out.println("result is " +sameResult3);

	}

}
