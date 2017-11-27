package com.doslin.leetcode.array._75;

/**
 * Sort Colors
 * Created by doslin on 2017/11/27.
 */
public class Solution {
	public void sortColors(int[] nums) {
		int i=0;
		int j=0;
		int k=nums.length;
		
		while(j<k) {
			if(nums[j] == 1) {
				j++;
			} else if (nums[j] == 0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				i++;
				j++;
			} else {
				int tmp = nums[j];
				nums[j] = nums[k-1];
				nums[k-1] = tmp;
				k--;
			}
		}
	}
	
}
