package solve.baekjoon.loop;

import java.io.*;

public class T2741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 1 ; i <=num; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}
}
