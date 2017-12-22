package com.doslin.leetcode.linkedlist._61;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Rotate List
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode rrotateRight(ListNode head, int k) {
		if (null == head) {
			return null;
		}
		int size = 0;
		ListNode currNode = head;
		while (null != currNode) {
			currNode = currNode.next;
			size++;
		}
		k %= size;
		ListNode fastNode = head, slowNode = head;
		for (int i = 0; i < k; i++) {
			if (null != fastNode) {
				fastNode = fastNode.next;
			}
		}

		if (null == fastNode) {
			return head;
		}

		while (null != fastNode.next) {
			fastNode = fastNode.next;
			slowNode = slowNode.next;
		}

		fastNode.next = head;
		fastNode = slowNode.next;
		slowNode.next = null;

		return fastNode;
	}
}
