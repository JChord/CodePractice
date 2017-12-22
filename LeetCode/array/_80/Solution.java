package com.doslin.leetcode.array._80;

/**
 * Remove Duplicates from Sorted Array II
 * Created by doslin on 2017/11/27.
 */
public class Solution {
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for (int n : nums) {
			if (i < 2 || n > nums[i - 2]) {
				nums[i++] = n;
			}
		}
		return i;
	}
}
