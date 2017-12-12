package com.doslin.leetcode.array._3;

/**
 * Longest Substring Without Repeating Characters
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int freq[] = new int[256];
		int l = 0, r = -1; // 滑动窗口为 [l...r]
		int result = 0;

		while (l < s.length()) {
			if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
				freq[s.charAt(++r)] ++;
			} else {
				freq[s.charAt(l++)] --;
			}
            
            result = Math.max(result, r-l+1);
		}
		return result;
	}
}
