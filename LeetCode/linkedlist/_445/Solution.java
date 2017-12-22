package com.doslin.leetcode.linkedlist._445;

import java.util.Stack;

import com.doslin.leetcode.linkedlist.base.ListNode;

/**
 * Add Two Numbers II
 * Created by doslin on 2017/12/22.
 */
public class Solution {
	public ListNode addTwoNumbners(ListNode l1, ListNode l2) {
		Stack<Integer> reverseL1 = new Stack<Integer>();
		Stack<Integer> reverseL2 = new Stack<Integer>();
		
		while (null != l1) {
			reverseL1.push(l1.val);
			l1 = l1.next;
		}
		
		while(null != l2) {
			reverseL2.push(l2.val);
			l2 = l2.next;
		}
		
		ListNode currNode = new ListNode(-1);
		int sum = 0;
		while(!reverseL1.isEmpty() || !reverseL2.isEmpty()) {
			if (!reverseL1.isEmpty()) {
				sum += reverseL1.pop();
			}
			
			if (!reverseL2.isEmpty()) {
				sum += reverseL2.pop();
			}
			currNode.val = sum % 10;
			ListNode head = new ListNode(sum / 10);
			head.next = currNode;
			sum /= 10;
			currNode = head;
		}
		if (-1 == currNode.val) {
			currNode = currNode.next;
		}
		return currNode;
	}
}
