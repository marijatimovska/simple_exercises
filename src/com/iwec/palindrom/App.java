package com.iwec.palindrom;

public class App {

	public static void main(String[] args) {
		String word = "marija";

		int l = word.length() - 1;
		
		System.out.println(l + "\n");

		char[] r = word.toCharArray();

		for (int i = word.length() - 1; i < r.length; i++) {
			System.out.println(r[i] + "\n");
		}

		for (int i = 0; i < r.length - 1; i++) {
			for (int j = 1; j < r.length - i; j++) {
				//System.out.println(r[j]);
				int proba = r.length - j;
				System.out.println(proba);
			}
		}

	}

}
