package solve.baekjoon.basicMath1;

import java.io.*;

public class T1712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		br.close();
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		
		System.out.println(calculate(A,B,C));
	}
	
	public static int calculate(int A, int B, int C) {
		if(B >= C) {
			return -1;
		}else {
			return (A/(C-B))+1;
		}
	}
}