package solve.baekjoon.basicMath1;
import java.io.*;

public class T2775 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());// 층 
			int n = Integer.parseInt(br.readLine());// 호  
			
			bw.write(peopleCnt(k,n)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int peopleCnt(int k, int n) {
		if(n == 1) {
			return 1;
		}
		
		int[][] array = new int[15][15];
		for(int i = 0; i <=k; i++) { // 층 
			for(int j = 1; j <= n; j++) { //호  
				
				if(i == 0) {
					array[i][j] = j;
				}else {
					for(int l =1; l <=j ; l++) {
						array[i][j] += array[i-1][l];
					}
				}
			}
		}
		
		return array[k][n];
	}
}