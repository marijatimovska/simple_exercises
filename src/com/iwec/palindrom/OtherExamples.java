package com.iwec.palindrom;

public class OtherExamples {
	public static boolean isPalinrome(String word) {
		{
			// test for end of recursion
			if (word.length() < 2) {
				return true;
			}

			// check first and last character for equality
			if (word.charAt(0) != word.charAt(word.length() - 1)) {
				return false;
			}

			// recursion call
			return isPalinrome(word.substring(1, word.length() - 1));
		}
	}

}

/* int n = word.length();
 * for (int i = 0; i < (n/2); ++i) {
			if (word.charAt(i) != word.charAt(n - i - 1)) {
				return false;
			}
	}
			return true;
}
*/	
