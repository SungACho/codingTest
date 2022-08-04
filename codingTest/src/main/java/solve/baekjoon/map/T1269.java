package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T1269 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] line = br.readLine().split(" ");
		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;
		
		// A 집합 원소 map에 저장 
		for(String a : br.readLine().split(" ")) {
			map.put(a, 1);
		}
		// B 집합 원소 map에 저장 
		for(String b : br.readLine().split(" ")) {
			map.put(b, map.getOrDefault(b, 0) + 1);
		}
		// map에 1개 들어간 요소의 수 구함. (대칭 차집합의 원소의 갯수) 
		for(String s : map.keySet()) {
			if(map.get(s) == 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}