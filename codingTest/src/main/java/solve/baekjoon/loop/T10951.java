package solve.baekjoon.loop;

import java.io.*;

public class T10951 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = null;
		String[] line = null;
		int a = 0;
		int b = 0;
		
		while( (str=br.readLine()) != null ){
			line = str.split(" ");
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}   