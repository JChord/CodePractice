package com.doslin.leetcode.tree._226;

import java.util.LinkedList;
import java.util.Queue;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Invert Binary Tree
 * Created by doslin on 2017/11/23.
 */
public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (null == root) {
			return root;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			TreeNode tmpNode = node.right;
			node.right = node.left;
			node.left = tmpNode;

			if (null != node.left) {
				queue.offer(node.left);
			}

			if (null != node.right) {
				queue.offer(node.right);
			}
		}

		return root;
	}
}
