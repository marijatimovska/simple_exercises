package com.iwec.palindrom;

public class Test {

	public static void main(String[] args) {
		String original = "Anaanam";
		boolean res = isPalindrom(original);	
		System.out.println(res);
	}

	private static boolean isPalindrom(String original) {
		String reverse = "";
		
		char[] proba = original.toCharArray();
		
		for (int i = proba.length - 1; i >= 0; i--) {
			reverse += proba[i];
		}
		if(original.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

}
