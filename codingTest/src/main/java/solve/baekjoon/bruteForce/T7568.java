package solve.baekjoon.bruteForce;

import java.io.*;

public class T7568 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[] person = new String[2];
		int[] weight = new int[cnt];
		int[] height = new int[cnt];

		int biggerCnt = 0; // 자기보다 덩치가 큰 사람 수 만큼 증가 
		int[] result = new int[cnt]; // index, 등수 
		
		// 배열에 저장 
		for(int i = 0 ; i < cnt; i ++) {
			person = br.readLine().split(" ");
			weight[i] = Integer.parseInt(person[0]);
			height[i] = Integer.parseInt(person[1]);
		}
		
		// 자신보다 더 큰 덩치의 명수 저장 
		for(int j = 0 ; j < cnt; j++) {
			biggerCnt = 1;
			for(int k = 0; k < cnt; k++) {
				if(j == k) {
					continue;
				}
				if(weight[j] < weight[k] && height[j] < height[k]) {
					biggerCnt++;
				}
			}
			result[j] = biggerCnt;
		}
		
		for(int num : result) {
			sb.append(num).append(" ");
		}
		System.out.println(sb.toString());
		
	}
}