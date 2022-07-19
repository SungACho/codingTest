package solve.baekjoon.array;

import java.io.*;
import java.util.*;

public class T2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int idx = 1;
		int max = Integer.parseInt(br.readLine());
		
		for(int i =2 ; i <10; i++) {
			int num = Integer.parseInt(br.readLine());
			if(max < num) {
				max = num;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
