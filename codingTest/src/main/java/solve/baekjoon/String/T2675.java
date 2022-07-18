package solve.baekjoon.String;

import java.io.*;

public class T2675 {
	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for(int i = 0 ; i <num; i++) {
			String[] line = br.readLine().split(" ");
			int cnt = Integer.parseInt(line[0]);
			String str = line[1];

			for(char c : str.toCharArray()) {
				for(int j = 0 ; j <cnt; j++) {
					bw.write(c);
				}
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
}
