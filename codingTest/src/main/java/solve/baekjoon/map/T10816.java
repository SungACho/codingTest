package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		for(String card : br.readLine().split(" ")) {
			map.put(card, map.getOrDefault(card, 0) +1);
		}
		
		int M = Integer.parseInt(br.readLine());
		for(String num : br.readLine().split(" ")) {
			if(map.containsKey(num)) {
				bw.write(map.get(num) + " ");
			}else {
				bw.write("0 ");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}