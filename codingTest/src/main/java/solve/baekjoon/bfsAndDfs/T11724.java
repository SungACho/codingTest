package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T11724 {
	static List<List<Integer>> graph = new ArrayList<>();
	static boolean[] checked;
	static int cc = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);

		// 그래프 초기화 
		checked = new boolean[N+1];
		for(int i = 0; i < N+1; i++) {
			graph.add(new ArrayList<>());
		}
		// 그래프 값 입력 
		int u, v;
		for(int i =1; i <= M; i++) {
			line = br.readLine().split(" ");
			u = Integer.parseInt(line[0]);
			v = Integer.parseInt(line[1]);
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		// 덩어리 계산 
		for(int i = 1; i < N+1; i++) {
			if(!checked[i]) {
				bfs(i);
			}
		}
		
		System.out.println(cc);
		
	}
	
	public static void bfs(int num) {		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(num);
		checked[num] = true;
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			
			for(int node : graph.get(curr)) {
				if(!checked[node]) {
					queue.offer(node);
					checked[node] = true;
				}
			}
		}
		cc++;
		
	}
	
}
