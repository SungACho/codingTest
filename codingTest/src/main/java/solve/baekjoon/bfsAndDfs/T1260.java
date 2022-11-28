package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T1260 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static boolean[] checkdDFS;
	static boolean[] checkdBFS;
	static Queue<Integer> queue = new LinkedList<>();
	static int cnt;
	static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int V = Integer.parseInt(line[2]);
		
		// 리스트 및 배열 크기 할당(초기화) 
		checkdDFS = new boolean[N+1];
		checkdBFS = new boolean[N+1];
		for(int i = 0 ; i < N+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 그래프 연결관계 데이터 저장
		line = null;
		int u, v;
		while(M -- > 0) {
			line = br.readLine().split(" ");
			u = Integer.parseInt(line[0]);
			v = Integer.parseInt(line[1]);
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		//System.out.println(graph);
		for(List<Integer> list : graph) {
			Collections.sort(list);
		}
		//System.out.println(graph);

		// 1. DFS 문제풀이 
		solve_dfs(V);
		result.append("\n");
		// 2. BFS 문제풀이 
		solve_bfs(V);
		System.out.println(result.toString());
	}
	
	private static void solve_dfs(int node) {
		if(!checkdDFS[node]) {
			checkdDFS[node] = true;
			result.append(node+" ");
			
			for(int i = 0 ; i < graph.get(node).size(); i++) {
				int subNode = graph.get(node).get(i);
				solve_dfs(subNode);
			}
		}
	}

	private static void solve_bfs(int startNode) {
		queue.offer(startNode);
		checkdBFS[startNode] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			//System.out.println("num: "+num);
			result.append(num+" ");
			
			for(int i = 0; i < graph.get(num).size(); i++) {
				int subNum = graph.get(num).get(i);
				//System.out.println("subNum: "+subNum);
				if(!checkdBFS[subNum]) {
					queue.offer(subNum);
					checkdBFS[subNum] = true;
				}
			}
		}

	}
}
