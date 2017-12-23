package com.doslin.leetcode.recursion._46;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations
 * Created by doslin on 2017/12/23.
 */
public class Solution {
	private List<List<Integer>> result = new ArrayList<>();
	private boolean[] used;

	public List<List<Integer>> permute(int[] nums) {
		if (0 == nums.length) {
			return result;
		}
		used = new boolean[nums.length];
		List<Integer> p = new ArrayList<>();
		generatePermutation(nums, 0, p);
		return result;
	}

	/**
	 * 
	 * @param nums
	 * @param index
	 * @param p 保存了一个有 index-1 个元素排列，向这个排列的末尾添加第 index 个元素， 
	 * 			获得一个有 index 个元素的排列
	 */
	private void generatePermutation(int[] nums, int index, List<Integer> p) {
		if (index == nums.length) {
			result.add(new ArrayList<Integer>(p));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				p.add(nums[i]);
				generatePermutation(nums, index+1, p);
				p.remove(p.size()-1);
				used[i] = false;
			}
		}
	}
}
