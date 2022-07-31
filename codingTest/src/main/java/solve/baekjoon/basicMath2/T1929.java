package solve.baekjoon.basicMath2;
import java.io.*;

// 참고 :  https://st-lab.tistory.com/81
	
public class T1929 {
	public static boolean[] prime;	// 소수를 체크할 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] line = br.readLine().split(" ");
		int M = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
			
		makePrimeList(N);
 
		for(int i = M; i <=N; i++) {
			if(prime[i] == false) {	// 소수(false)일 경우 출력
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	// N 이하 소수 생성 메소드 
		public static void makePrimeList(int N) {
			
			prime = new boolean[N + 1];	// 0 ~ N
	 
			/*
			소수가 아닌 index = true
			소수인 index = false
			*/
			
			// 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
			if(N < 2) {
				return;
			}
	        
			prime[0] = prime[1] = true;
			
	        
			// 제곱근 함수 : Math.sqrt()
			for(int i = 2; i <= Math.sqrt(N); i++) {
	        
				// 이미 체크된 배열이면 다음 반복문으로 skip
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