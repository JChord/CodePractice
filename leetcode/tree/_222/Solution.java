package com.doslin.leetcode.tree._222;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Count Complete Tree Nodes
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public int countNodes(TreeNode root) {
		int hLeft = 0, hRight = 0;

		TreeNode leftNode = root, rightNode = root;
		while (null != leftNode) {
			hLeft++;
			leftNode = leftNode.left;
		}

		while (null != rightNode) {
			hRight++;
			rightNode = rightNode.right;
		}

		if (hLeft == hRight) { // 说明是满二叉树
			return (1 << hLeft) - 1;
		}
		// 节点个数为左子树的节点个数加上右子树的节点个数再加1(根节点)
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
}
