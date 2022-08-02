package solve.baekjoon.bruteForce;

import java.io.*;

public class T2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int length = String.valueOf(N).length();
		int start = N - (9*length);
		
		int temp = 0;
		int sum = 0;
		int result = 0;
		
		for(int i = start; i < N; i++) {
			temp = i;
			sum = 0;
			while(temp != 0) {
				sum += temp%10;
				temp /=10;
			}
			if(i+sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}