package com.doslin.leetcode.linkedlist._203;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Remove Linked List Elements
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (null == head) {
			return null;
		}
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}
}
