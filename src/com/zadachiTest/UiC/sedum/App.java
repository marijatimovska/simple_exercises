package com.zadachiTest.UiC.sedum;

public class App {

	public static void main(String[] args) {
		RNDNumber rnd = new RNDNumber();
		int res = rnd.randomNum();
		System.out.println(res);
		
		WithDecimal wd = new WithDecimal();
		int reswd = wd.numberWD();
		System.out.println(reswd);

	}

}
