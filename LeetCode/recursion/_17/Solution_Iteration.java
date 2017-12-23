package com.doslin.leetcode.recursion._17;

import java.util.ArrayList;
import java.util.List;

/**
 * Letter Combinations of a Phone Number
 * Created by doslin on 2017/12/22.
 */
public class Solution_Iteration {
	private final String[] dicts = { 
			" ", 	// 0
			"",		// 1
			"abc",	// 2
			"def",	// 3
			"ghi", 	// 4
			"jkl", 	// 5
			"mno", 	// 6
			"pqrs",	// 7
			"tuv", 	// 8
			"wxyz" 	// 9
			};

	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < digits.length(); i++) {
			char[] c = dicts[digits.charAt(i) - '0'].toCharArray();
			List<String> temp = new ArrayList<String>();
			for (int j = 0; j < c.length; j++) {
				if (result.isEmpty()) {
					result.add("");
				}
				for (String s : result) {
					temp.add(s + c[j]);
				}
			}
			result = temp;
		}
		return result;
	}
}
