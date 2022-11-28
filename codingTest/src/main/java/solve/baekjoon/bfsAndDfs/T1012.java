package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T1012 {
	static ArrayList<Integer> result = new ArrayList<>();
	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int m, n;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 그래프 저장 
		String[] line;
		int M,N,K;
		int X,Y;
		for(int i = 0 ; i < T; i++) {
			line = br.readLine().split(" ");
			M = Integer.parseInt(line[0]);
			N = Integer.parseInt(line[1]);
			K = Integer.parseInt(line[2]);
			
			int[][] graph = new int[M][N];
			for(int j = 0; j < K; j++) {
				line = br.readLine().split(" ");
				X = Integer.parseInt(line[0]);
				Y = Integer.parseInt(line[1]);
				graph[X][Y] = 1;
			}
			result.add(solve_dfs(graph));
		}

		for(int r : result) {
			sb.append(r).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int solve_dfs(int[][] grid) {
		int sum = 0;
		m = grid.length;
		n = grid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int area = dfs(grid, i, j);
					sum++;
				}
			}
		}
		
		return sum;
	}

	public static int dfs(int[][] grid, int i, int j) {
		if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
			return 0;
		int area = 1;
		grid[i][j] = 0;
		for (int[] dir : dirs) {
			int x = i + dir[0];
			int y = j + dir[1];
			area += dfs(grid, x, y);
		}
		return area;
	}
}
