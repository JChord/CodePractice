package com.doslin.leetcode.stack._20;

import java.util.Stack;

/**
 * Valid Parentheses
 * Created by doslin on 2017/12/14.
 */
public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()) {
			if ("({[".contains(String.valueOf(c))) {
				stack.push(c);
			} else {
				if (!stack.isEmpty()) {
					String m = String.valueOf(stack.peek());
					switch (c) {
					case ')':
						if ("(".equals(m)) {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					case '}':
						if ("{".equals(m)) {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					case ']':
						if ("[".equals(m)) {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					}
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
