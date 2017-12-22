package com.doslin.leetcode.array._167;

/**
 * Two Sum II - Input array is sorted
 * Created by doslin on 2017/11/27.
 */
public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		while(numbers[i] + numbers[j] != target) {
			if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] {i+1, j+1};
	}
}
