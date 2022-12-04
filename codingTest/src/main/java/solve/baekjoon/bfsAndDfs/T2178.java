package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T2178 {
	static boolean[][] checked;
	static int[][] graph;
	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int N,M;	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
	
		checked = new boolean[N][M];
		graph = new int[N][M];
		String row;
		
		// 그래프 저장 
		for(int i = 0 ; i < N; i++) {
			row = br.readLine();
			for(int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(row.substring(j, j+1));
			}
		}
		solve_bfs();
		System.out.println(graph[N-1][M-1]);
		
	}
	
	public static void solve_bfs() {
		if (graph == null || graph.length == 0)
			return;
		
		bfs(graph, 0, 0);
	}

	private static void bfs(int[][] grid, int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		checked[0][0] = true;
		q.offer(new int[] { i, j });

		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int curX = curr[0];
			int curY = curr[1];

			for (int[] dir : dirs) {
				int newX = curX + dir[0];
				int newY = curY + dir[1];
				
				if (newX >= 0 && newX < N && newY >= 0 && newY < M && grid[newX][newY] == 1) {
					checked[newX][newY] = true;
					graph[newX][newY] = graph[curX][curY] +1;
					q.offer(new int[] { newX, newY });
				}
			}
		}
		return;
	}
}
