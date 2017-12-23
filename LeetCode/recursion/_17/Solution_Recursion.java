package com.doslin.leetcode.recursion._17;

import java.util.ArrayList;
import java.util.List;

/**
 * Letter Combinations of a Phone Number
 * Created by doslin on 2017/12/23.
 */
public class Solution_Recursion {
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
	
	private List<String> result = new ArrayList<>();
	
	public List<String> letterCombinations(String digits) {
		if (null == digits || digits.length() == 0) {
			return result;
		}
		findCombination(digits, 0, "");
		return result;
	}
	
	/**
	 * 
	 * @param digits 需要处理的数字字符串
	 * @param index 每次处理一位
	 * @param s 保存了digits[0...index-1]的字符串
	 */
	private void findCombination(String digits, int index, String s) {
		if (index == digits.length()) {
			// 保存 s
			result.add(s);
			return;
		}
		char	 c = digits.charAt(index);
		String letters = dicts[c-'0'];
		for(int i=0; i< letters.length(); i++) {
			findCombination(digits, index+1, s + letters.charAt(i));
		}
	}
}
