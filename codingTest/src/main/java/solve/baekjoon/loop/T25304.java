package solve.baekjoon.loop;

import java.io.*;

public class T25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		String[] line = null;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			sum += Integer.parseInt(line[0]) * Integer.parseInt(line[1]);
		}
		
		if(X == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		br.close();
	}
}