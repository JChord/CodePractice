package com.doslin.leetcode.linkedlist._143;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Reorder List
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public void reorderList(ListNode head) {
		if (null == head || null == head.next) {
			return;
		}
		
		ListNode fastNode = head;
		ListNode slowNode = head;
		
		// 找到链表的中点，并将链表从中点处断开，形成两个独立的链表
		while(null != fastNode.next && null != fastNode.next.next) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		
		ListNode midNode = slowNode.next;
		slowNode.next = null;
		
		// 翻转第二个链表
		ListNode lastNode = midNode;
		ListNode preNode = null;
		while(null != lastNode) {
			ListNode nextNode = lastNode.next;
			lastNode.next = preNode;
			preNode = lastNode;
			lastNode = nextNode;
		}
		
		// 将第二个链表的元素间隔地插入第一个链表中
		while(null != head && null != preNode) {
			ListNode nextNode = head.next;
			head.next = preNode;
			preNode = preNode.next;
			head.next.next = nextNode;
			head = nextNode;
		}
	}
}
