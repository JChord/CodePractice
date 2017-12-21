package com.doslin.leetcode.tree._129;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Sum Root to Leaf Numbers
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public int sumNumbers(TreeNode root) {
		return sum(root, 0);
	}
	
	private int sum(TreeNode node, int sum) {
		if (null == node) {
			return 0;
		}
		
		int result = node.val + sum*10;
		if (null == node.left && null == node.right) {
			return result;
		}
		return sum(node.left, result) + sum(node.right, result);
	}
}
