package solve.baekjoon.Recursive;

import java.io.*;

public class T10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(factorial(N, 1));
	}
	
	public static int factorial(int N, int result) {
		if(N == 0) {
			return 1;
		}
		
		result *= N;
		N--;
		
		if(N == 0) {
			return result;
		}else {
			return factorial(N, result);
		}
	}
}