package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt1 = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(String card : br.readLine().split(" ")) {
			map.put(card, 1);
		}
		
		int cnt2 = Integer.parseInt(br.readLine());
		
		for(String num : br.readLine().split(" ")) {
			if(map.containsKey(num)) {
				bw.write(1+" ");
			}else {
				bw.write(0+" ");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}