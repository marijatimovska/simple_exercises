package com.obratno;

public class App {

	public static void main(String[] args) {
		Obratno ob = new Obratno();
		String res = ob.obratno();
		System.out.println(res);
		
		String test = "Hello World";
		ob.obratnoSB(test);
		
	}

}
