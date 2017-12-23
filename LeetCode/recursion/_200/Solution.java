package com.doslin.leetcode.recursion._200;

/**
 * Number of Islands
 * Created by doslin on 2017/12/24.
 */
public class Solution {
	private int[][] d = new int[][] { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	private int m, n;
	private boolean[][] visited;

	private boolean inArea(int x, int y) {
		return x >= 0 && x < m && y >= 0 && y < n;
	}

	public int numIslands(char[][] grid) {
		m = grid.length;
		if (0==m) {
            return 0;
        }
		n = grid[0].length;
		visited = new boolean[m][n];
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					dfs(grid, i, j);
					res++;
				}
			}
		}
		return res;
	}

	// 从 grid[x][y] 的位置开始，进行 floodfill
	private void dfs(char[][] grid, int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int moveX = x + d[i][0];
			int moveY = y + d[i][1];
			if( inArea(moveX, moveY) && !visited[moveX][moveY] && grid[moveX][moveY] == '1' ) {
				dfs( grid , moveX , moveY );
			}
                
		}
	}
}
