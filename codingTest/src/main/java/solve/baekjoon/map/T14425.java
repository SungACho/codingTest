package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T14425 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;
		
		for(int i = 0; i < Integer.parseInt(line[0]); i++) {
			map.put(br.readLine(), 0);
		}
		
		for(int j = 0; j < Integer.parseInt(line[1]); j++) {
			if(map.containsKey(br.readLine())) {
				cnt++;
			}
		}
		
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}
}