package solve.baekjoon.array;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class T11003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken()); //슬라이딩 윈도우 수 
		Deque<Node> deque = new LinkedList<>();
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			// deque 내 현재 값 보다 큰 수 제거 
			while(!deque.isEmpty() && deque.getLast().value > now) {
				deque.removeLast();
			}
			
			// deque에 현재 값 추가 
			deque.addLast(new Node(i, now));
			
			// deque에 슬라이딩 윈도우 값 넘어가는 index 제거
			if(deque.getFirst().index <= i - L) {
				deque.removeFirst();
			}
			
			bw.write(deque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
		
	}
	
	static class Node{
		int index;
		int value;
		
		Node(int index, int value){
			this.index = index;
			this.value = value;
		}
	}
}
