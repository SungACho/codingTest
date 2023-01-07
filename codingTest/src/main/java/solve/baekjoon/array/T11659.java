package solve.baekjoon.array;

import java.io.*;

public class T11659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" "); 
		int M = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		
		line = br.readLine().split(" ");
		// 배열 저장 
		int [] array = new int[M];
		for(int i = 0; i < M; i++) {
			if(i == 0) {
				array[i] = Integer.parseInt(line[i]);
			}else {
				array[i] = array[i-1] + Integer.parseInt(line[i]);
			}
		}
		
		// 합 저장
		int i, j;
		for(int x = 0; x < N; x++) {
			line = br.readLine().split(" ");
			i = Integer.parseInt(line[0])-1;
			j = Integer.parseInt(line[1])-1;
			
			if(i ==0) {
				bw.write(array[j]+"\n");
			}else {
				bw.write(array[j] - array[i-1]+"\n");
			}
			
		}
		bw.flush();
		
	}
}
