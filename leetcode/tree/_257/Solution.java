package com.doslin.leetcode.tree._257;

import java.util.ArrayList;
import java.util.List;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Binary Tree Paths
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<>();
		if (null == root) {
			return paths;
		}
		List<String> leftPaths = binaryTreePaths(root.left);
		List<String> rightPaths = binaryTreePaths(root.right);
		for (String path : leftPaths) {
			paths.add(root.val + "->" + path);
		}
		for (String path : rightPaths) {
			paths.add(root.val + "->" + path);
		}

		if (paths.size() == 0) {
			paths.add(Integer.toString(root.val));
		}
		return paths;
	}
}
