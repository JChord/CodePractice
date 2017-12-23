package com.doslin.leetcode.recursion._79;

/**
 * Word Search
 * Created by doslin on 2017/12/24.
 */
public class Solution {
	private int[][] d = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	private int m, n;
	private boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		m = board.length;
		n = board[0].length;
		visited = new boolean[m][n];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (searchWord(board, word, 0, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	// 从 board[startX][startY] 开始，寻找 word[index...word.length()]
	private boolean searchWord(char[][] board, String word, int index, int startX, int startY) {
		if (index == word.length() - 1) {
			return board[startX][startY] == word.charAt(index);
		}

		if (board[startX][startY] == word.charAt(index)) {
			visited[startX][startY] = true;
			// 从 startX，startY 出发，向四个方向寻找
			for (int i = 0; i < 4; i++) {
				int moveX = startX + d[i][0];
				int moveY = startY + d[i][1];
				if (inArea(moveX, moveY) && !visited[moveX][moveY]) {
					if (searchWord(board, word, index + 1, moveX, moveY)) {
						return true;
					}
				}
			}
			visited[startX][startY] = false;
		}

		return false;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n;
	}
}
