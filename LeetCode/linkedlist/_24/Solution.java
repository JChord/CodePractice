package com.doslin.leetcode.linkedlist._24;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Swap Nodes in Pairs
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (null == head || null == head.next) {
			return head;
		}
		
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		
		// 指向交换节点的前一个节点
		ListNode preNode = fakeHead;
		// 指向要交换的节点
		ListNode targetNode = fakeHead.next;
		 
		while(null != targetNode && null != targetNode.next) {
			ListNode tempNode = targetNode.next.next;
			targetNode.next.next = targetNode;
			preNode.next = targetNode.next;
			targetNode.next = tempNode;
			preNode = targetNode;
			targetNode = targetNode.next;
		}
		return fakeHead.next;
	}
}
