package com.doslin.leetcode.stack._150;

import java.util.Stack;

/**
 * Evaluate Reverse Polish Notation
 * Created by doslin on 2017/12/18.
 */
public class Solution {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();

		for (String token : tokens) {
			switch (token) {
			case "+":
				stack.push(stack.pop() + stack.pop());
				break;
			case "-":
				stack.push(-stack.pop() + stack.pop());
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				int b = stack.pop(), a = stack.pop();
				stack.push(a / b);
				break;

			default:
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}

}
