package com.iwec.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 5;

		System.out.println("Fibonacci Series of the number is:\n" + fibonacciRec(n));
		
			
		fibonacci(n);

	}
	
	private static int fibonacciRec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRec(n - 1) + fibonacciRec(n - 2);

	}

	private static void fibonacci(int num) {
		int a = 0;
		int b = 0; 
		int c = 1;
		
		
		System.out.println("Fibonacci Series of the number is:");
		
		for (int i = 0; i <= num; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(a + "");
		}		
		
	}

	
	
	

}
