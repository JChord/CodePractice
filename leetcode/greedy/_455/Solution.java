package com.doslin.leetcode.greedy._455;

import java.util.Arrays;

/**
 * Assign Cookies
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int si = s.length - 1, gi = g.length - 1;
		int result = 0;

		while (gi >= 0 && si >= 0) {
			if (s[si] >= g[gi]) {
				result++;
				si--;
				gi--;
			} else {
				gi--;
			}
		}
		return result;
	}
}
