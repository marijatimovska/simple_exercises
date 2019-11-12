package com.zadachiTest.zadachiTest.tri;

import java.util.ArrayList;
import java.util.List;

public class Proba {
	public static int count = 0;
	public static List<List<Integer>> lists = new ArrayList<>();

	public static void main(String[] args) {
		int[] array = { 5, 6, 2, 4, 1, 3, 7 };
		int sum = 8;
		int n = array.length;

		getSubsetCountThatSumToTargetValue(array, n, sum, new ArrayList<Integer>());
		System.out.println("Result count: " + count);
		System.out.println("lists: " + lists);
	}

	public static void getSubsetCountThatSumToTargetValue(int[] arr, int k, int targetSum, List<Integer> list) {
		if (targetSum == 0) {
			count++;
			lists.add(list);
			return;
		}
		if (k <= 0) {
			return;
		}

		getSubsetCountThatSumToTargetValue(arr, k - 1, targetSum, list);
		List<Integer> appendedlist = new ArrayList<>();
		appendedlist.addAll(list);
		appendedlist.add(arr[k - 1]);
		getSubsetCountThatSumToTargetValue(arr, k - 1, targetSum - arr[k - 1], appendedlist);
	}
}
