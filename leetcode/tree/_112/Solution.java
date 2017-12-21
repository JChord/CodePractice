package com.doslin.leetcode.tree._112;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Path Sum
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (null == root) {
			return false;
		}
		if (null == root.left && null == root.right) {
			return root.val == sum;
		}
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}
}
