package solve.baekjoon.basicMath1;

import java.io.*;

public class T2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(calculate(N));
	}
	
	public static int calculate(int N) {
		
		if(N%5 == 0) {
			System.out.println("case1");
			return N/5;
			
		}else if((N%5)%3 == 0) {
			System.out.println("case2");
			return (N/5) + (N%5)/3;
			
		}else {
			System.out.println("case3");
			int result = -1;
			
			for(int i = N/5; i >=0; i--) {
				int mod = N-(i*5);
				
				if((mod)%3 == 0) {
					return i+ (mod/3);
				}
			}
			return result;
		}
	}
}