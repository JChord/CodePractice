package com.doslin.leetcode.linkedlist._19;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Remove Nth Node From End of List
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int size = 0;
		ListNode fakeNode = new ListNode(-1);
		fakeNode.next = head;
		ListNode currNode = fakeNode;
		while(null != currNode) {
			currNode = currNode.next;
			size++;
		}
		
		ListNode preNode = fakeNode;
		for(int i=0; i<size-n; i++) {
			preNode = preNode.next;
		}
		preNode.next = preNode.next.next;
		return fakeNode.next;
	}
}
