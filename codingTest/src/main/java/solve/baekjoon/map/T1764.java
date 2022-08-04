package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T1764 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] line = br.readLine().split(" ");
		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;
		String temp = "";
		
		for(int i = 0 ; i < Integer.parseInt(line[0]); i++) {
			map.put(br.readLine(), 0);
		}
		// array로 듣보잡 리스트를 생성 
		for(int j = 0; j < Integer.parseInt(line[1]); j++) {
			temp = br.readLine();
			if(map.containsKey(temp)) {
				sb.append(temp).append(" ");
				cnt++;
			}
		}
		// array를 사전순으로 정렬 
		String[] array = sb.toString().split(" ");
		Arrays.sort(array);
		
		// 출력문 생성 
		sb = new StringBuilder();
		sb.append(cnt+"\n");
		for(String s : array) {
			sb.append(s + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}