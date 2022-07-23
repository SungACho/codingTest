package solve.baekjoon.loop;

import java.io.*;

public class T11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= cnt; i++) {
			String[] list = br.readLine().split(" ");
			int num1 = Integer.parseInt(list[0]);
			int num2 = Integer.parseInt(list[1]);
			bw.write("Case #" + i + ": " + num1 +" + " + num2 + " = "+ (num1+num2) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
