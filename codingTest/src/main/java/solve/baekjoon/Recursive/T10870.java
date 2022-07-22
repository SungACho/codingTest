package solve.baekjoon.Recursive;

import java.io.*;

public class T10870 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		if(N == 0 ) {
			System.out.println(0);
		}else if( N ==1 ) {
			System.out.println(1);
		}else {
			System.out.println(fibonacci(2, N, 0, 1));
		}
	}

	public static int fibonacci(int curN, int N, int beforeVal1, int beforeVal2) {
		
		if(curN == N ) {
			return beforeVal1 + beforeVal2;
		}else {
			return fibonacci(curN+1, N, beforeVal2, beforeVal1 + beforeVal2); 
		}
	}
}