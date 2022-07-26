package solve.baekjoon.loop;

import java.io.*;

public class T10871 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line1 = br.readLine().split(" ");
		int X = Integer.parseInt(line1[1]);
		
		for(String s : br.readLine().split(" ")) {
			int A = Integer.parseInt(s);
			if(X > A) {
				bw.write(A+" ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
