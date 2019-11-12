package com.zadachiTest.UiC.sedum;

import java.util.Random;


// Random br da se otstranat nuli
public class RNDNumber {
	private Random rnd = new Random();
	private int num;
	private String temp;
	private String res;

	public int randomNum() {
		num = rnd.nextInt(100000);
		temp = String.valueOf(num);
		res = temp.replace("0", "");
		num = Integer.parseInt(res);

		return num;
	}

}
