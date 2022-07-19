package solve.baekjoon.array;

import java.io.*;

public class T1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		double[] result = new double[num];
		
		for(int i = 0 ; i < num ; i++) {
			String[] list = br.readLine().split(" ");
			
			int cnt = Integer.parseInt(list[0]);
			double chkCnt = 0; 
			double sum = 0;
			double avg = 0;
			
			for(int j = 1 ; j <list.length; j++) {
				sum += Double.parseDouble(list[j]);
			}
			avg = sum/cnt;

			for(int j = 1 ; j <list.length; j++) {
				if( avg < Double.parseDouble(list[j])) {
					chkCnt++;
				}
			}
			result[i] = Math.round((chkCnt/cnt*100)*1000)/1000.0;
		}
		
		for(int k = 0; k < result.length; k++) {
			System.out.println(String.format("%.3f", result[k])+"%");
		}
	}
}


//40.0
//57.14285714285714
//33.33333333333333
//66.66666666666666
//55.55555555555556
