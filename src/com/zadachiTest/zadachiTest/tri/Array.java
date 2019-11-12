package com.zadachiTest.zadachiTest.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//Niza, da se pecata subnizi od odredena suma.
public class Array {
	
	public void printCombinations(int[] array, int begin, int sum, int[] arr) {
		if (Arrays.stream(arr).sum() == sum) {
			System.out.println(Arrays.toString(arr));
		}
		for (int i = begin + 1; i < array.length; i++) {
			int[] newAcc = new int[arr.length + 1];
			System.arraycopy(arr, 0, newAcc, 0, arr.length);
			newAcc[arr.length] = array[i];
			printCombinations(array, i, sum, newAcc);
		}
	}

	public void findSubsets(Set<List<Integer>> allSubsets, List<Integer> nums, int sum) {
		if (nums.size() == 0) {
			return;
		}
		int currentSum = 0;
		for (Integer num : nums) {
			currentSum += num;
		}

		if (currentSum == sum) {
			allSubsets.add(new ArrayList<>(nums));
		}

		for (int i = 0; i < nums.size(); i++) {
			final List<Integer> subset = new ArrayList<>(nums);
			subset.remove(i);
			findSubsets(allSubsets, subset, sum);
		}
	}

	public void test(int[] arr, int n, int sum) {
		int totalSubSets = (1 << n);
		for (int i = 0; i < totalSubSets; i++) { // loop over all possible subsets
			int curSum = 0;
			for (int j = n - 1; j >= 0; j--) {
				if (((i >> j) & 1) > 0) { // if bit at jth position is 1 take that value
					curSum += arr[j];
				}
			}
			if (curSum == sum) { // valid subset found, then print it
				for (int j = n - 1; j >= 0; j--) { // looping in reverse order to print set in decreasing order
					if (((i >> j) & 1) > 0) { // if bit at jth position is 1 take that value
						System.out.print(arr[j] + " ");
					}
				}
				System.out.println("");
			}
		}
	}
}
