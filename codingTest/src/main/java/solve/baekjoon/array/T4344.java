package solve.baekjoon.array;

import java.io.*;

public class T4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String list[] = br.readLine().split(" ");
		double max = 0; 
		double sum = 0;
		
		for(int i = 0 ; i < list.length; i++){
			double num = Double.parseDouble(list[i]);
			max = Math.max(max,num);
		}
		
		for(int j = 0; j < list.length; j++) {
			sum += Double.parseDouble(list[j])/max*100;
		}

		System.out.println(sum/cnt);	
	}
}
