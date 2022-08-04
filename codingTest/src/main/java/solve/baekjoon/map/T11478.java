package solve.baekjoon.map;

import java.io.*;
import java.util.*;

public class T11478 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int length = S.length();
		String temp = "";
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 1 ; i <= length; i++ ) {
			
			for(int j = 0; j < length-i+1; j++) {
				temp = S.substring(j, j+i);
				map.put(temp, 1); 
			}
		}
		
		System.out.println(map.size());
	}
}