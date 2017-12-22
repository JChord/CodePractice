package com.doslin.leetcode.linkedlist._92;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Reverse Linked List II
 * Created by doslin on 2017/11/28.
 */
public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {

		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		
		ListNode parent = fakeHead;
		for(int i=0; i<m-1; i++) {
			parent = parent.next;
		}
		ListNode start = parent.next;
		ListNode range = start.next;
		
		for(int i=0; i<n-m; i++) {
	        start.next = range.next;
	        range.next = parent.next;
	        parent.next = range;
	        range = start.next;
	    }
		
		return fakeHead.next;
	}
}
