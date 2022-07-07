package solve.baekjoon.conditional;

import java.util.Scanner;

public class T2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		if(0 > H || H> 23 || 0 > M || M > 59) {
			return;
		}

		if(M == 45) {
			M = 0;
		}else if(M < 45) {
			H = (H-1);
			M = (60+M)-45;
		}else {
			M = M-45;
		}

		if(H <0) H = 24+H;

		System.out.println(H + " " + M);
	}
}