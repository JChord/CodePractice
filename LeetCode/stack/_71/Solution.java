package com.doslin.leetcode.stack._71;

import java.util.Stack;

/**
 * Simplify Path
 * Created by doslin on 2017/12/18.
 */
public class Solution {
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		for (String str : path.split("/")) {
			switch (str) {
			case "..":
				if (!stack.isEmpty()) {
					stack.pop();
				}
				break;
			case "":
			case ".":
				break;
			default:
				stack.push(str);
				break;
			}

		}
		return "/" + String.join("/", stack);
	}
}
