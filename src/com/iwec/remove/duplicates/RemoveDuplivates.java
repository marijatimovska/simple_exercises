package com.iwec.remove.duplicates;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplivates {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 8 };
		String[] arrayString = { "g", "g", "y", "g", "f", "b", "b", "a", "a" };

		Set<String> setString = new HashSet<String>();
		for (String i : arrayString) {
			setString.add(i);

		}
		System.out.println(setString);

		// With Set
		Set<Integer> set = new HashSet<Integer>();
		for (int num : array) {
			set.add(num);
		}
		System.out.println(set);

		int length = array.length;
		length = remove(array, length);
		for (int i = 0; i < length; i++)
			System.out.print(array[i] + " ");

	}

	private static int remove(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}

}
