package com.doslin.leetcode.array._11;

/**
 * Container With Most Water
 * Created by doslin on 2017/11/27.
 */
public class Solution {
	public int maxArea(int[] height) {
		int area = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			int h = Math.min(height[i], height[j]);
			area = Math.max(area, (j - i) * h);
			while (height[i] <= h && i < j) {
				i++;
			}
			while (height[j] <= h && i < j) {
				j--;
			}	
		}
		return area;
	}
}
