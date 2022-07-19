package solve.baekjoon.array;

import java.io.*;
import java.util.*;

public class T2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int[] list = new int[10];
		
		for(char c : String.valueOf(num1*num2*num3).toCharArray()) {
			int num = c - '0';
			list[num] = list[num]+1;
		}
		
		for(int i = 0 ; i <list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
