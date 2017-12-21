package com.doslin.leetcode.tree._450;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Delete Node in a BST
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (null == root) {
			return null;
		}
		if (root.val > key) {
			root.left = deleteNode(root.left, key);
		} else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		} else {
			if (null == root.left || null == root.right) {
				root = (null != root.left) ? root.left : root.right;
			} else {
				TreeNode currNode = root.right;
				while (null != currNode.left) {
					currNode = currNode.left;
				}
				root.val = currNode.val;
				root.right = deleteNode(root.right, currNode.val);
			}
		}
		return root;
	}
}
