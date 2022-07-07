package solve.baekjoon.conditional;

import java.util.Scanner;

public class T2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int min = sc.nextInt();
		if(0 > H || H> 23 || 0 > M || M > 59 || 0> min || min >1000) {
			return;
		}

		if(M+min <= 59) {
			M = M+min;
		}else if(M+min > 59) {
			H = H + (M+min)/60;
			M = (M+min)%60;
		}

		if(H <0) {
			H = 24+H;
		}else if(H > 23) {
			H= H-24;
		}

		System.out.println(H + " " + M);
	}
}