package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T7569 {
	static int[][][] graph;
	static Queue<int[]> queue = new LinkedList<>();
	static int[][] dirs = { { 0, 0, 1 }, { 0, 0, -1 }, { 0, 1, 0 }, { 0, -1, 0 }, { 1, 0, 0 }, { -1, 0, 0 } };
	static int m, n, h;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		m = Integer.parseInt(line[0]);
		n = Integer.parseInt(line[1]);
		h = Integer.parseInt(line[2]);
		graph = new int[h][n][m];

		// 그래프 저장 
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				line = br.readLine().split(" ");
				for(int k = 0 ; k < m; k++) {
					graph[i][j][k] = Integer.parseInt(line[k]);
				}
			}
		}
		
		// 1 찾기 
  		for(int i = 0; i < h; i++) {
			for(int j = 0 ; j < n; j++) {
				for(int k = 0 ; k < m; k++) {
					if(graph[i][j][k] == 1) {
						queue.offer(new int[] {i, j, k});
						System.out.println(i+", "+j+", "+k);
					}
				}
			}
		}
  		print();
  		System.out.println();
		bfs();
		
		print();
		
		// 결과계산 
		int maxCnt = 0;
		for(int i = 0;  i< h; i++) {
			for(int j = 0 ; j < n; j++) {
				for(int k = 0 ; k < m; k++) {
				
					maxCnt = Math.max(maxCnt, graph[i][j][k]);
					
					if(graph[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}

		System.out.println(maxCnt-1);
		
	}
	
	public static void bfs() {		
		int currX, currY, currH;
		int newX, newY, newH;
		
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			currH = curr[0];
			currX = curr[1];
			currY = curr[2];
			
			for(int[] dir: dirs) {
				newH = currH + dir[0];
				newX = currX + dir[1];
				newY = currY + dir[2];
				
				if(newH >= 0 && newH < h && newX >= 0 && newX < n && newY >= 0 && newY < m && graph[newH][newX][newY] == 0) {
					System.out.println("1. graph[newH][newX][newY] : "+ graph[newH][newX][newY]);
					graph[newH][newX][newY] = graph[currH][currX][currY]+1;
					System.out.println("w. graph[newH][newX][newY] : "+ graph[newH][newX][newY]);
					queue.offer(new int[] {newH, newX, newY});
				}
			}
		}
	}
	
	public static void print() {
		// 그래프 출력 
		for(int i = 0; i < h; i++) {
			for(int j = 0 ; j < n; j++) {
				for(int k = 0 ; k < m; k++) {
					System.out.print(graph[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
	
}