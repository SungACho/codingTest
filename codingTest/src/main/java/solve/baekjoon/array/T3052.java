package solve.baekjoon.array;

import java.io.*;

public class T3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] list = new int[42];
		int cnt = 0;
		
		for(int i = 0; i <10; i++) {
			int rmd = Integer.parseInt(br.readLine())%42;
			list[rmd] = list[rmd]+1;
		}
		
		for(int j = 0 ; j < list.length; j++) {
			if(list[j] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
