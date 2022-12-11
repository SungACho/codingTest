package solve.baekjoon.bfsAndDfs;

import java.io.*;
import java.util.*;

public class T1697 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
	
        if (N >= K) {
            System.out.println(N - K);
        }else{
		    bfs(N, K);
        }
		sc.close();
	}
	
	public static void bfs(int N, int K) {
		int[] cntList = new int[100001];
		Queue<Integer> queue = new LinkedList<>();
		int curVal, newVal;
		
		queue.add(N);
		cntList[N] = 1;
		
		while(!queue.isEmpty()) {			
			curVal = queue.poll();
			
			for(int i = 0 ; i < 3 ; i++) {
				if(i == 0) {
					newVal = curVal + 1;
				}else if(i == 1){
					newVal = curVal - 1;
				}else {
					newVal = curVal * 2;
				}
				
				if(newVal == K) {
					System.out.println(cntList[curVal]);
					return;
				}
				
				if(newVal >= 0 && newVal < 100001 && cntList[newVal] == 0) {
					queue.add(newVal);
					cntList[newVal] = cntList[curVal] + 1;
				}
				
			}
		}
	}
}
