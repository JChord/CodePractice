package com.doslin.leetcode.linkedlist._83;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Remove Duplicates from Sorted List
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode currNode = head;
		while (null != currNode && null != currNode.next) {
			if (currNode.val == currNode.next.val) {
				currNode.next = currNode.next.next;
			} else {
				currNode = currNode.next;
			}
		}
		return head;
	}
}
