package com.doslin.leetcode.tree._404;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Sum of Left Leaves
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public int sumOfLeftLeaves(TreeNode root) {
		if (null == root) {
			return 0;
		}
		int result = 0;
		if (null != root.left) {
			TreeNode leftNode = root.left;
			if (null == leftNode.left && null == leftNode.right) {
				result += leftNode.val;
			} else {
				result += sumOfLeftLeaves(leftNode);
			}
		}

		if (null != root.right) {
			result += sumOfLeftLeaves(root.right);
		}
		return result;
	}
}
