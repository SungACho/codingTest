package solve.baekjoon.array;

import java.io.*;

public class T10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int min = 1000000;
		int max = -1000000;
		
		for(int i = 0 ; i < length; i++) {
			min = Math.min(min, Integer.parseInt(array[i]));
			max = Math.max(max, Integer.parseInt(array[i]));
		}
		System.out.println(min + " " + max);
	}
}
