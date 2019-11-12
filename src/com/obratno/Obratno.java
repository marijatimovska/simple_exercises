package com.obratno;

public class Obratno {
	String zbor = "Hello World";
	String reverse = "";

	public String obratno() {
		char[] res = zbor.toCharArray();
		for (int i = res.length - 1; i >= 0; i--) {
			reverse += res[i];
		}
		return reverse;

	}

	public void obratnoSB(String sentance) {

		StringBuilder sb = new StringBuilder();
		sb.append(sentance);
		sb = sb.reverse();
		System.out.println(sb);

	}

}
