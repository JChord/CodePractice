package com.doslin.leetcode.tree._111;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * Created by doslin on 2017/11/23.
 */
public class Solution {

	public int minDepth(TreeNode root) {
		if (null == root) {
			return 0;
		}

		if (null == root.left) {
			return minDepth(root.right) + 1;
		} else if (null == root.right) {
			return minDepth(root.left) + 1;
		} else {
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}
	}
}
