package com.doslin.leetcode.queue._23;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.doslin.leetcode.queue.base.ListNode;

/**
 * Merge k Sorted Lists
 * Created by doslin on 2017/12/21.
 */
public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		if (null == lists || lists.length == 0) {
			return null;
		}

		Queue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});

		ListNode fake = new ListNode(0);
		ListNode tail = fake;

		for (ListNode node : lists) {
			if (null != node) {
				queue.add(node);
			}

		}

		while (!queue.isEmpty()) {
			tail.next = queue.poll();
			tail = tail.next;

			if (null != tail.next) {
				queue.add(tail.next);
			}

		}
		return fake.next;
	}
}
