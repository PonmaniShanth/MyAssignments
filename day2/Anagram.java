package homeassignmentweek3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String text1 = "stops";
			String text2 = "potss";
			
			int length = text1.length();
			System.out.println(length);
			int length2 = text2.length();
			System.out.println(length2);
			
			char[] charArray = text1.toCharArray();
		Arrays.sort(charArray);
		char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray2);
			
		if(Arrays.equals(charArray,charArray2)) {
				System.out.println("The given strings are Anagram");
			} else {
		         System.out.println("The given strings are not Anagram");
			}
			


	}

}
