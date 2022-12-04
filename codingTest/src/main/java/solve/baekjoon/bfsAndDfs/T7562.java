package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T7562 {
	static boolean[][] checked;
	static int[][] graph;
	static int[][] dirs = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { -2, -1 }, {-1,-2}, {1,-2}, {2, -1} };
	static int I;
	static int desX, desY;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		String[] curLoc;
		String[] desLoc;
		int curX, curY;
		
		for(int i = 0; i < testCase; i++) {
			I = Integer.parseInt(br.readLine());
			curLoc = br.readLine().split(" ");
			desLoc = br.readLine().split(" ");
			curX = Integer.parseInt(curLoc[0]);
			curY = Integer.parseInt(curLoc[1]);
			desX = Integer.parseInt(desLoc[0]);
			desY = Integer.parseInt(desLoc[1]);
			
			checked = new boolean[I][I];
			graph = new int[I][I];
			
			solve_bfs(curX, curY);
			bw.write(graph[desX][desY]+"");
			bw.newLine();
		}
		bw.flush();
		
	}
	
	public static void solve_bfs(int x, int y) {
		if (graph == null || graph.length == 0 || (x == desX && y == desY) )
			return;
		
		bfs(x, y);
	}

	private static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		checked[i][j] = true;
		q.offer(new int[] { i, j });

		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int curX = curr[0];
			int curY = curr[1];

			for (int[] dir : dirs) {
				int newX = curX + dir[0];
				int newY = curY + dir[1];
				
				if (newX >= 0 && newX < I && newY >= 0 && newY < I && checked[newX][newY] == false) {
					checked[newX][newY] = true;
					graph[newX][newY] = graph[curX][curY] +1;
					if(newX ==desX && newY == desY) return;
					q.offer(new int[] { newX, newY });
				}
			}
		}
	}
}
