package solve.baekjoon.basicMath2;
import java.io.*;

public class T1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int cnt = 0;
		
		for(int i = 0 ; i <line.length; i ++) {
			if(isDeciaml(Integer.parseInt(line[i]))) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
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