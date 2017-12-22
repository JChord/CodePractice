package com.doslin.leetcode.tree._101;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Symmetric Tree
 * Created by doslin on 2017/11/23.
 */
public class Solution_Recursion {
	public boolean isSymmetric(TreeNode root) {
		if (null == root) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode left, TreeNode right) {

		if (null == left && null == right) {
			return true;
		}

		if (null == left || null == right) {
			return false;
		}
		return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}
}
