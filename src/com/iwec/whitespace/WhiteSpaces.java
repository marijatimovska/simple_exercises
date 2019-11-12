package com.iwec.whitespace;

public class WhiteSpaces {

	public static void main(String[] args) {

		String str = "This is a test sentance   to remove all   whitespaces";
		String res = str.replace(" ", "");

		System.out.println(res);

		
		char[] chars = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < chars.length; i++) {
			if ((chars[i] != ' ') && (chars[i] != '\t')) {
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);

	}

}
