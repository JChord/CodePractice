package com.doslin.leetcode.tree._110;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Balanced Binary Tree
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public boolean isBalanced(TreeNode root) {
		return findDepth(root) != -1;
	}

	int findDepth(TreeNode root) {
		if (null == root) {
			return 0;
		}

		int leftDepth = findDepth(root.left);
		if (-1 == leftDepth) {
			return -1;
		}

		int rightDepth = findDepth(root.right);
		if (-1 == rightDepth) {
			return -1;
		}

		if (Math.abs(leftDepth - rightDepth) > 1) {
			return -1;
		}
		return Math.max(leftDepth, rightDepth) + 1;
	}
}
