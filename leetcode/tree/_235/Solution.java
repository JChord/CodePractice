package com.doslin.leetcode.tree._235;

import com.doslin.leetcode.tree.base.TreeNode;

/**
 * Lowest Common Ancestor of a Binary Search Tree
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || p == root || q == root) {
        		return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        
        if (null != leftNode && null != rightNode) {
            return root;
        } 
        if (null != leftNode) {
            return leftNode;
        }
        if (null != rightNode) {
            return rightNode;
        }
		return null;
    }
}
