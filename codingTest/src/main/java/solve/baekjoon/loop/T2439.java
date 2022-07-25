package solve.baekjoon.loop;

import java.io.*;

public class T2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1 ; i <= N ; i++) {
			for(int j = 1 ; j <= N ; j++) {
				if(N-i+1 > j) {
					bw.write(" ");
				}else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
