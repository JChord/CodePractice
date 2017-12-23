package com.doslin.leetcode.recursion._47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Permutations II
 * Created by doslin on 2017/12/24.
 */
public class Solution {
	private List<List<Integer>> result = new ArrayList<>();
	private boolean[] used;

	public List<List<Integer>> permuteUnique(int[] nums) {
		if (0 == nums.length) {
			return result;
		}

		used = new boolean[nums.length];
		List<Integer> p = new ArrayList<>();
		Arrays.sort(nums);
		generatePermutation(nums, 0, p);
		return result;
	}

	private void generatePermutation(int[] nums, int index, List<Integer> p) {
		if (index == nums.length) {
			result.add(new ArrayList<Integer>(p));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
				continue;
			}
			used[i] = true;
			p.add(nums[i]);
			generatePermutation(nums, index + 1, p);
			p.remove(p.size()-1);
			used[i] = false;
		}
	}
}
