package com.doslin.leetcode.queue._347;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Top K Frequent Elements
 * Created by doslin on 2017/12/19.
 */
public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		// 扫描 freq (最小堆)， 维护当前出现频率最高的 k 个元素
		Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k,
				new Comparator<Map.Entry<Integer, Integer>>() {
					public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
						return e1.getValue() - e2.getValue();
					}
				});

		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			if (queue.size() == k) {
				if (entry.getValue() > queue.peek().getValue()) {
					queue.poll();
					queue.add(entry);
				}
			} else {
				queue.add(entry);
			}
		}
		List<Integer> result = new ArrayList<>(k);
		for (Map.Entry<Integer, Integer> entry : queue) {
			result.add(entry.getKey());
		}
		return result;
	}
}
