package solve.baekjoon.basicMath1;

import java.io.*;

public class T1712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		br.close();
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		
		System.out.println(calculate(A,B,C));
	}
	
	public static int calculate(int A, int B, int C) {
		/*
		 * A + (B x i) < (C x i)인 케이스의 i를 구해야 함
		 * 
		 *** 판매비용 (C x i) =  A + (B x i) => 손익이 0
		 * => i개 팔았을때 손익이 0 
		 * => i+1개를 팔면 손익분기점!
		 * 
		 *** 예외처리 
		 * 1개 생상시 발생하는 가변비용(B)이 판매비용(C)보다 큰 경우는 이익이 날 수 없음 : 무조건 -1 return
		 * 
		 *** 그 외 계산식
		 * (C x i) =  A + (B x i)
		 * A = (C x i) - (B x i)
		 * A = (C - B) x i
		 * A/(C - B) = i
		 * => 손익분기점 : i + 1 => A/(C - B) + 1
		 */
		if(B >= C) {
			return -1;
		}else {
			return (A/(C-B))+1;
		}
	}
}