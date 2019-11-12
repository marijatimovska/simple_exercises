package com.iwec.prime;

public class Prime {

	public static void main(String[] args) {

		int i = 7;
		boolean res = isPrime(i);
		System.out.println(res);

	}

	private static boolean isPrime(int x) {
		for (int i = 2; i <= x/2; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

}
