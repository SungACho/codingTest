package solve.baekjoon.bruteForce;

import java.io.*;
import java.util.*;

public class T2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		String[] line2 = br.readLine().split(" ");
		List<Integer> cards = new ArrayList<>();
		for(String s: line2) {
			cards.add(Integer.parseInt(s));
		}
		
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < N-2; i ++) {
			for(int j = i+1; j < N-1; j++) {
				if(i == j) {
					continue;
				}
				for(int k = j+1 ; k < N; k ++) {
					if(i==k || j == k) {
						continue;
					}
					sum = cards.get(i) + cards.get(j) + cards.get(k);
					if(sum <= M) {
						result = Math.max(result, sum);
					}
					if(result == M) {
						System.out.println(result);
						return;
					}
				}
			}
		}
		System.out.println(result);
		br.close();
	}
}