package com.doslin.leetcode.recursion._77;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations
 * Created by doslin on 2017/12/24.
 */
public class Solution {

	private List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> combine(int n, int k) {
		if (n <= 0 || k <= 0 || k > n) {
			return result;
		}
		List<Integer> c = new ArrayList<>();
		generateCombinations(n, k, 1, c);
		return result;
	}

	// 求解 C(n,k)，当前已经找到的组合存储在 c 中，需要从 start 开始搜索新的元素
	private void generateCombinations(int n, int k, int start, List<Integer> c) {
		if (c.size() == k) {
			result.add(new ArrayList<Integer>(c));
			return;
		}
		for (int i = start; i <= n; i++) {
			c.add(i);
			generateCombinations(n, k, i + 1, c);
			c.remove(c.size()-1);
		}
	}
}
