package com.doslin.leetcode.array._27;

/**
 * Remove Element
 * Created by doslin on 2017/11/24.
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				continue;
			}
			nums[j] = nums[i];
			j++;
		}
		return j;
	}
}
