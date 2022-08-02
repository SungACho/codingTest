package solve.baekjoon.basicMath2;
import java.io.*;

public class T9020 {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		int num1 = 0;
		int num2 = 0;
		
		chkPrime();
		
		for(int i = 0 ; i < T ; i++) {
			N = Integer.parseInt(br.readLine());
			num1 = N/2;
			num2 = N/2;
			
			for(int j = N/2; j > 0 ; j--) {
				if(!prime[num1] && !prime[num2] && num1+num2 == N) {
					bw.write(num1 + " " + num2 + "\n");
					break;
				}
				num1--;
				num2++;
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void chkPrime() {
        
		prime[0] = prime[1] = true;
		
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
        
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
	}
}