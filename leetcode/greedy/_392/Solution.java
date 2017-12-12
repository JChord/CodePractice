package com.doslin.leetcode.greedy._392;

/**
 * Is Subsequence
 * Created by doslin on 2017/12/12.
 */
public class Solution {
	public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
        		return true;
        }
        int i=0, j=0;
        while (j<t.length()) {
        		if(t.charAt(j) == s.charAt(i)) {
        			i++;
        			if (i==s.length()) {
        				return true;
        			}
        		}
        		j++;
        }
		return false;
    }
}
