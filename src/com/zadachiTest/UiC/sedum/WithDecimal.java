package com.zadachiTest.UiC.sedum;

import java.text.DecimalFormat;

//Decimalen br da se otstranat nuli
public class WithDecimal {
	private DecimalFormat df = new DecimalFormat("0.#");
	private double num;

	public int numberWD() {
		num = 55.00;

		df.format(num);

		return (int) num;
	}

}
