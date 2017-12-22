package com.doslin.leetcode.greedy._435;

import java.util.Arrays;
import java.util.Comparator;

import com.doslin.leetcode.greedy.base.Interval;

/**
 * Non-overlapping Intervals
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public int eraseOverlapIntervals(Interval[] intervals) {
		if (intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				if (o1.end != o2.end) {
					return o1.end - o2.end;
				}
				return o1.start - o2.start;
			}

		});
		
		int result = 1;
		int pre = 0;
		for (int i=1; i< intervals.length; i++) {
			if (intervals[i].start >= intervals[pre].end) {
				result ++;
				pre = i;
			}
		}
		return intervals.length - result;
	}
}
