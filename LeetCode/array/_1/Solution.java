package com.doslin.leetcode.array._1;

/**
 * Two Sum
 * Created by doslin on 2017/11/23.
 */
public class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int first = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				int second = nums[j];
				if ((first + second) == target) {
					return new int[] { i, j };
				}

			}
		}
		return new int[] {};
	}
}
