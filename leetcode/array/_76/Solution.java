package com.doslin.leetcode.array._76;

/**
 * Minimum Window Substring
 * Created by doslin on 2017/12/14.
 */
public class Solution {
	public String minWindow(String s, String t) {
		int freq[] = new int[256];

		for (char c : t.toCharArray()) {
			freq[c]++;
		}

		int total = t.length();
		int l = 0, r = 0;
		int begin = 0, end = 0;
		int len = s.length() + 1;
		for (int i = 0; i < s.length(); i++) {
			if (--freq[s.charAt(i)] >= 0) {
				// 匹配了一个 t 中的字符
				total--;
				r = i;
			}
			// 缩小左边界
			while (total == 0) {
				if (r - l + 1 < len) {
					begin = l;
					end = r + 1;
					len = end - begin;
				}
				// 移出了一个 s 子串中的字符
				if (++freq[s.charAt(l++)] > 0) {
					total++;
				}
			}

		}
		if (len > s.length()) {
			return "";
		}
		return s.substring(begin, end);
	}
}
