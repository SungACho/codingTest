package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T2667 {
	static ArrayList<Integer> result = new ArrayList<>();
	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int m, n;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] graph = new int[N][N];
		
		// 그래프 저장 
		String line;
		for(int i =0; i < N; i++) {
			line = br.readLine();
			for(int j = 0 ; j < N; j++) {
				String s = line.substring(j,j+1);
				//System.out.print("s: "+s);
				graph[i][j] = Integer.parseInt(s);
			}
		}
		
		solve_dfs(graph);
		
		Collections.sort(result);
		sb.append(result.size()).append("\n");
		for(int r : result) {
			sb.append(r).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public static void solve_dfs(int[][] grid) {
		m = grid.length;
		n = grid[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					int area = dfs(grid, i, j);
					result.add(area);
				}
			}
		}
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
