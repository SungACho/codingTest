package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T1620 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		String temp = "";
		
		for(int i = 1 ; i <=Integer.parseInt(line[0]); i++) {
			temp = br.readLine();
			map1.put(temp, i);
			map2.put(i, temp);
		}
		
		for(int j = 0; j < Integer.parseInt(line[1]); j++) {
			temp = br.readLine();
			if(map1.containsKey(temp)) {
				bw.write(map1.get(temp)+"\n");
			}else {
				bw.write(map2.get(Integer.parseInt(temp))+"\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}