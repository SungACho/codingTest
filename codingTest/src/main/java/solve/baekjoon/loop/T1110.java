package solve.baekjoon.loop;

import java.io.*;

public class T1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int newNum = N;
		
		int firstNum = 0;
		int lastNum = 0;
		int sum = 0;
		int result = 0;
		
		while(true) {
			firstNum = newNum/10;
			lastNum = newNum%10;
			sum = firstNum+lastNum;
			
			newNum = lastNum*10 + sum%10;
			result++;
			
			if(N == newNum) {
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}
