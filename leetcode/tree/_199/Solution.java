package com.doslin.leetcode.tree._199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Binary Tree Right Side View
 * Created by doslin on 2017/11/23.
 */
public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (i == size - 1) {
					result.add(node.val);
				}

				if (null != node.left) {
					queue.offer(node.left);
				}

				if (null != node.right) {
					queue.offer(node.right);
				}
			}
		}

		return result;
	}
}
