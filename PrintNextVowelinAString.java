package EY2208;

import java.util.HashMap;

public class PrintNextVowelinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aeiou";
		System.out.println("Next vowel in the string is   " + printNextVowel(str.toCharArray()));
	}
	public  static String printNextVowel(char[] str) {
		HashMap<Character, Integer> hMap = new HashMap<>();
		hMap.put('a', 0);
		hMap.put('e', 1);
		hMap.put('i', 2);
		hMap.put('o', 3);
		hMap.put('u', 4);
		
		char[] arr= {'a','e','i','o','u'};
		
		int lengthOfString = arr.length;
		
		for(int i =0; i<lengthOfString; i++) {
			char c = str[i];
			System.out.println("charcter  is " +c);
			if(c == 'a' || c == 'e' || c== 'i' || c== 'o' ||c == 'u') {
				int index  = hMap.get(c) + 1;
				int newIndex = index % 5;
				
				str[i] = arr[newIndex];
				}
			
		}
		return String.valueOf(str);
	}

}
