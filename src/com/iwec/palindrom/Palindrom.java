package com.iwec.palindrom;

public class Palindrom {

	public static void main(String[] args) {
		String original = "Stets";

		boolean res = isPalindomeSB(original);
		System.out.println(res);
		isPalindrom(original);
	}

	private static void isPalindrom(String original) {
		String reverse = "";
		int length = original.length();
		for (int i =length -1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse is:" +reverse);
		
		if(original.equalsIgnoreCase(reverse)) 
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not a palindrome");
		
	}

	private static boolean isPalindomeSB(String original) {
		StringBuilder sb = new StringBuilder();
		sb.append(original);
		sb = sb.reverse();

		if (original.equalsIgnoreCase(sb.toString())) {
			return true;
		}
		return false;
	}

}
