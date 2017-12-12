package com.doslin.leetcode.array._283;

/**
 * Move Zeroes
 * Created by doslin on 2017/11/24.
 */
public class Solution {
	public void moveZeroes(int[] nums) {

		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			if (0 != curr) {
				nums[pos++] = curr;
			}
		}

		while (pos < nums.length) {
			nums[pos++] = 0;
		}
	}
}
