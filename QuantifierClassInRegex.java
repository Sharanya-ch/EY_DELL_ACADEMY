package EY2508;

import java.util.regex.Pattern;

// ? - once or not at all
// + occur once or more than once
// * zero or more than once
// {n} times only
public class QuantifierClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a or m or n - once or not at all
		System.out.println(Pattern.matches("[amn]?", "a"));//true
		System.out.println(Pattern.matches("[amn]?", "z"));//false
		System.out.println(Pattern.matches("[amn]?", "am"));//false
		System.out.println(Pattern.matches("[amn]?", ""));//true
		
		System.out.println(Pattern.matches("[amn]+", "aaaa"));//true
		System.out.println(Pattern.matches("[amn]+", "aaammmm"));//true
		System.out.println(Pattern.matches("[amn]+", "aaammmmoooo"));//false
		
		System.out.println(Pattern.matches("[amn]*", "z"));//false
		System.out.println(Pattern.matches("[amn]*", "aaammmmmmm"));//true

	}

}
