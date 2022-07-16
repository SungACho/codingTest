package solve.baekjoon.loop;

import java.util.Scanner;

public class T8393 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <=num; i++) {
			sum += i;
		}
		sc.close();
		System.out.println(sum);
	}
}
