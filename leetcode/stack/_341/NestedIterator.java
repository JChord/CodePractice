package com.doslin.leetcode.stack._341;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import com.doslin.leetcode.stack.base.NestedInteger;

/**
 * Flatten Nested List Iterator
 * Created by doslin on 2017/12/18.
 */
public class NestedIterator implements Iterator<Integer> {

	private Stack<Iterator<NestedInteger>> stack = new Stack<Iterator<NestedInteger>>();
	private NestedInteger nextInt;

	public NestedIterator(List<NestedInteger> nestedList) {
		stack.clear();
		stack.push(nestedList.iterator());
	}

	@Override
	public Integer next() {
		return nextInt != null ? nextInt.getInteger() : null;
	}

	@Override
	public boolean hasNext() {
		while (!stack.isEmpty()) {
			if (!stack.peek().hasNext()) {
				stack.pop();
			} else if ((nextInt = stack.peek().next()).isInteger()) {
				return true;
			} else {
				stack.push(nextInt.getList().iterator());
			}
		}
		return false;
	}
}
