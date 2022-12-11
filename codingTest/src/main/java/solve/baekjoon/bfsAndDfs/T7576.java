package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T7576 {
	static boolean[][] checked;
	static int[][] graph;
	static Queue<int[]> queue = new LinkedList<>();
	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	static int n,m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		m = Integer.parseInt(line[0]);
		n = Integer.parseInt(line[1]);
		graph = new int[n][m];
		checked = new boolean[n][m];

		// 그래프 저장 
		for(int i = 0; i < n; i++) {
			line = br.readLine().split(" ");
			for(int j = 0 ; j < m; j++) {
				graph[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		// 1 찾기 
  		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < m; j++) {
				if(graph[i][j] == 1) {
					queue.offer(new int[] {i, j});
				}
			}
		}
		bfs();
		
		// 그래프 출력 
//		for(int i = 0; i < n; i++) {
//			for(int j = 0 ; j < m; j++) {
//				System.out.print(graph[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		// 결과계산 
		int minusCnt = 0;
		int maxCnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0 ; j < m; j++) {
				maxCnt = Math.max(maxCnt, graph[i][j]);
				
				if(graph[i][j] == 0) {
					minusCnt++;
				}
			}
		}
		if(minusCnt > 0) {
			System.out.println(-1);
		}else {
			System.out.println(maxCnt-1);
		}
	}
	
	public static void bfs() {		
		int currX, currY;
		int newX, newY;
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			currX = curr[0];
			currY = curr[1];
			
			for(int[] dir: dirs) {
				newX = currX + dir[0];
				newY = currY + dir[1];
				
				if(newX >= 0 && newX < n && newY >= 0 && newY < m && graph[newX][newY] == 0) {
					//System.out.println("1. graph[newX][newY] : "+ graph[newX][newY]);
					graph[newX][newY] = graph[currX][currY]+1;
					//System.out.println("2. graph[newX][newY] : "+ graph[newX][newY]);
					queue.offer(new int[] {newX,newY});
				}
			}
		}
	}
	
}
