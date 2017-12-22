package com.doslin.leetcode.linkedlist._2;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Add Two Numbers
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (null == l1) {
			return l2;
		}
		if (null == l2) {
			return l1;
		}
		int sum = l1.val + l2.val;
		ListNode head = new ListNode(sum % 10);
		head.next = addTwoNumbers(l1.next, l2.next);
		if (sum >= 10) {
			head.next = addTwoNumbers(new ListNode(sum / 10), head.next);
		}
		return head;
	}
}
