package solve.baekjoon.basicMath2;
import java.io.*;

public class T11653 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		bw.write(solve(N));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String solve(int N) {
		if(N == 1) return "";
		
		int temp = N;
		String result = "";
		
		for(int j = 2 ; j <=N; j++) {
			if(temp == 1) break;
			
			while(temp%j == 0) {
				temp /= j;
				result += j+"\n";
			}
		}
		return result;
	}
}