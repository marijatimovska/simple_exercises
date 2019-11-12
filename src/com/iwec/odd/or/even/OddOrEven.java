package com.iwec.odd.or.even;

public class OddOrEven {

	public static void main(String[] args) {

		int i = 100;
		boolean res = isOddOrEven(i);
		System.out.println(res);

	}

	private static boolean isOddOrEven(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return true;
			}
		}

		return false;
	}

}
