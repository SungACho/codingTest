package solve.baekjoon.basicMath2;
import java.io.*;

public class T4948 {
	public static boolean[] prime;	// 소수를 체크할 배열
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				break;
			}
			bw.write(solve(N)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static int solve(int N) {
		if(N < 2) {
			return 1;
		}

		prime = new boolean[(2*N) + 1];	// 0 ~ 2N
		prime[0] = prime[1] = true;
		int cnt = 0;
        
		// 제곱근 함수 : Math.sqrt()
		for(int i = 2; i <= Math.sqrt(2*N); i++) {
        
			// 이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i] == true) {
				continue;
			}
        
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i * i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
		
		for(int k = N+1; k <prime.length; k++) {
			if(!prime[k]) {
				cnt++;
			}
		}
		return cnt;
	}
}