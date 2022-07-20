package solve.baekjoon.String;

import java.io.*;

public class T2908 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] list = br.readLine().split(" ");
		int A = Integer.parseInt(list[0]);
		int B = Integer.parseInt(list[1]);
		
		int rvsA = 0;
		int rvsB = 0;
		
		for(int i =0; i <3 ; i++) {
			if(i==0) {
				rvsA = A%10;
				rvsB = B%10;
			}else {
				rvsA = rvsA*10 + A%10;
				rvsB = rvsB*10 + B%10;
			}

			A = A/10;
			B = B/10;
		}
		
		System.out.println(Math.max(rvsA, rvsB));
	}
}