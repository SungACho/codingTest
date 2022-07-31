package solve.baekjoon.basicMath2;
import java.io.*;

public class T2581 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		bw.write(solve(M,N));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String solve(int M, int N) {
		String result = "";
		int sum = 0;
		int min = 0;
		boolean isDecimal = false;
		
		for(int i = M; i <= N; i++) {
			isDecimal = isDeciaml(i);
			if(isDecimal) {
				sum += i;
			}
			if(isDecimal && min == 0) {
				min = i;
			}
		}
		if(sum == 0) {
			result = "-1";
		}else {
			result = sum + "\n" + min;
		}
		
		
		return result;
	}
	
	public static boolean isDeciaml(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int j = 2; j <=num; j++) {
			if(j != num && num%j == 0) {
				return false;
			}
			if( j == num && num%j == 0){
				return true;
			}
		}
		return false;
	}
}