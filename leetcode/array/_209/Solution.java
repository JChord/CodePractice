package com.doslin.leetcode.array._209;

/**
 * Minimum Size Subarray Sum
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int l = 0, r = -1; // nums[l...r] 为滑动窗口
		int sum = 0;
		int result = nums.length + 1;

		while (l < nums.length) {
			if (r + 1 < nums.length && sum < s) {
				sum += nums[++r];
			} else {
				sum -= nums[l++];
			}

			if (sum >= s) {
				result = Math.min(result, r - l + 1);
			}
		}
		if (result == nums.length + 1) {
			return 0;
		}
		return result;
	}
}
