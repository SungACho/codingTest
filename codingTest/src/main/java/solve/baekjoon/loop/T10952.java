package solve.baekjoon.loop;

import java.io.*;

public class T10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] line = br.readLine().split(" ");
			int A = Integer.parseInt(line[0]);
			int B = Integer.parseInt(line[1]);
			
			if(A == 0 || B == 0) {
				break;
			}
			bw.write((A+B) +"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}