package com.doslin.leetcode.linkedlist._206;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Reverse Linked List
 * Created by doslin on 2017/11/28.
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while(null != curr) {
			ListNode tmp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = tmp;
		}
		return pre;
	}
}
