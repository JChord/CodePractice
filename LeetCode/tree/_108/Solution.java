package com.doslin.leetcode.tree._108;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		return sort(nums, 0, nums.length);
	}

	private TreeNode sort(int[] nums, int start, int end) {
		if (start >= end) {
			return null;
		}

		int mid = start + (end - start) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sort(nums, start, mid);
		root.right = sort(nums, mid + 1, end);
		return root;
	}
}
