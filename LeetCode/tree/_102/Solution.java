package com.doslin.leetcode.tree._102;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Binary Tree Level Order Traversal
 * Created by doslin on 2017/11/23.
 */
public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			List<Integer> currLevelResult = new ArrayList<>();

			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				currLevelResult.add(node.val);

				if (null != node.left) {
					queue.offer(node.left);
				}

				if (null != node.right) {
					queue.offer(node.right);
				}
			}
			result.add(currLevelResult);
		}

		return result;
	}
}
