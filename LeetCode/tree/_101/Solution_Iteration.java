package com.doslin.leetcode.tree._101;

import java.util.LinkedList;
import java.util.Queue;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Symmetric Tree
 * Created by doslin on 2017/11/23.
 */
public class Solution_Iteration {
	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node1 = queue.poll();
			TreeNode node2 = queue.poll();
			if (null == node1 && null == node2) {
				continue;
			}
			if (null == node1 || null == node2) {
				return false;
			}
			if (node1.val != node2.val) {
				return false;
			}
			queue.add(node1.left);
			queue.add(node2.right);
			queue.add(node1.right);
			queue.add(node2.left);
		}
		return true;
	}
}
