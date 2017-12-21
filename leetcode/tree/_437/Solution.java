package com.doslin.leetcode.tree._437;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Path Sum III
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public int pathSum(TreeNode root, int sum) {
		if (null == root) {
			return 0;
		}
		return count(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	public int count(TreeNode root, int sum) {
		if (null == root) {
			return 0;
		}
		int count = 0;

		if (root.val - sum == 0) {
			count++;
		}
		count += count(root.left, sum - root.val);
		count += count(root.right, sum - root.val);
		return count;
	}
}
