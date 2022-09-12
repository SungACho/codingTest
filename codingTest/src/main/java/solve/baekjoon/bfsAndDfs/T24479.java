package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T24479 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();// 입력받은 간선 연결을 저장하는 그래프 
	static int curVisit;// 현재 방문 순서 
	static int[] visitOrderList;// 방문 순서를 저장하는 리스트 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받은 값으로 그래프 생성
		// 정점, 간선의 수, 시작정점 셋팅 
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int r = Integer.parseInt(line[2]);
		
		int u;
		int v;
		
		// 그래프 초기화
		for(int k = 0 ; k < n+1; k++) {
			graph.add(new ArrayList<Integer>());
		}
		visitOrderList = new int[n+1];
		
		// 간선으로 연결된 정점 그래프로 데이터 저장 
		for(int i = 0 ; i < m ; i++) {
			line = br.readLine().split(" ");
			u = Integer.parseInt(line[0]);
			v = Integer.parseInt(line[1]);
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		// 저장된 그래프를 오름차순으로 정렬
		for(ArrayList<Integer> g : graph) {
			Collections.sort(g);
		}
		
		// 1번부터 방문 순서를 매김 
		curVisit = 1;
		// 시작정점 r 부터 dfs 
		dfs(r);
		
		for(int j = 1; j < visitOrderList.length; j++) {
			bw.write(visitOrderList[j]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static void dfs(int node) {
		visitOrderList[node] = curVisit;
		int size = graph.get(node).size();
		
		if(size == 0) return;
		
		for(int i = 0; i < size; i++) {
			int newNode = graph.get(node).get(i);
			
			if(visitOrderList[newNode] == 0) {
				curVisit++;
				dfs(newNode);
			}
		}
		
	}
}
