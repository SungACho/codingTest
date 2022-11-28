package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T2606 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();// 입력받은 간선 연결을 저장하는 그래프 
	static boolean[] checked; // 확인한 컴퓨터 체크 리스트 
//	static Queue<Integer> queue = new LinkedList<>();
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());// 컴퓨터의 수 
		int n = Integer.parseInt(br.readLine());// 간선(네트워트)의 수 
		
		// 리스트 및 배열 크기 할당(초기화) 
		checked = new boolean[c+1];
		for(int i = 0 ; i < c+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		// 그래프 연결관계 데이터 저장
		String[] line;
		int u, v;
		while(n-- > 0) {
			line = br.readLine().split(" ");
			u = Integer.parseInt(line[0]);
			v = Integer.parseInt(line[1]);
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		// 1. BFS 문제풀이 
		//System.out.println(solve_bfs(1));
		
		// 2. DFS 문제풀이 
		cnt = -1;
		solve_dfs(1);
		System.out.println(cnt);
		
	}
	
	private static void solve_dfs(int node) {
		if(!checked[node]) {
			checked[node] = true;
			cnt++;
			
			for(int i = 0 ; i < graph.get(node).size(); i++) {
				int subNode = graph.get(node).get(i);
				solve_dfs(subNode);
			}
		}
	}
/*
	private static int solve_bfs(int startNode) {
		int result = -1; 
		queue.offer(startNode);
		checked[startNode] = true;
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			result++;
			
			for(int i = 0; i < graph.get(num).size(); i++) {
				int subNum = graph.get(num).get(i);
				if(!checked[subNum]) {
					queue.offer(subNum);
					checked[subNum] = true;
				}
			}
		}
		
		return result;
	}
*/
}
