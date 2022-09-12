package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T24444 {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();// 입력받은 간선 연결을 저장하는 그래프 
	static int curVisit;// 현재 방문 순서 
	static int[] visitOrderList;// 방문 순서를 저장하는 리스트
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] visited;// 방문했는지 체크하는 리스트 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 그래프의 크기 입력 받음  
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int r = Integer.parseInt(line[2]);
		
		// 입력받은 값으로 배열 초기화
		visitOrderList = new int[n+1];
		visited = new boolean[n+1];
		// 그래프 초기화
		for(int i = 0; i < n+1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		int u,v;
		// 그래프의 정점과 간선 연결 데이터 그래프에 저장 
		for(int j = 0 ; j < m; j++) {
			line = br.readLine().split(" ");
			u = Integer.parseInt(line[0]);
			v = Integer.parseInt(line[1]);
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		// 그래프를 오름차순으로 정렬 
		for(ArrayList<Integer> g : graph) {
			Collections.sort(g);
		}
		
		curVisit = 1;
		
		bfs(r);
		
		for(int k = 1; k < visitOrderList.length; k++) {
			bw.write(visitOrderList[k]+ "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static void bfs(int startNode) {
		// startNode queue에 넣기 
		queue.offer(startNode);
		visited[startNode] = true;
		
		while(!queue.isEmpty()) {
			// queue에서 값 뽑기 
			int num = queue.poll();
			// 방문순서 저장 
			visitOrderList[num] = curVisit++;
			
			// 뽑아낸 애랑 연결된 Node를 queue에 넣음 
			for(Integer subNum : graph.get(num)) {
				if(!visited[subNum]) {
					queue.offer(subNum);
					visited[subNum] = true;
				}
			}
				
		}
		
	}
}
