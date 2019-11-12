package com.swap;

public class App {

	public static void main(String[] args) {
		int a = 23;
		int b = 12;

		System.out.println("Variable before swap a = " + a + "b = " + b);

		swap(a, b);
		swapWithVar(a, b);

	}

	private static void swapWithVar(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Variable after swap a = " + a + "b = " + b);

	}

	private static void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Variable after swap a = " + a + "b = " + b);
	}

}
