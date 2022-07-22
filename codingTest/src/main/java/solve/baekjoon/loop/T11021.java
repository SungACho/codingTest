package solve.baekjoon.loop;

import java.io.*;

public class T11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1 ; i <= cnt; i++) {
			String[] list = br.readLine().split(" ");
			sum = Integer.parseInt(list[0])+Integer.parseInt(list[1]);
			bw.write("Case #"+i+": " + sum +"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}