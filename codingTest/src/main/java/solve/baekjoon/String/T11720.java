package solve.baekjoon.String;

import java.util.Scanner;

public class T11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		String num = sc.next();
		int result = 0;

		for(int i = 0 ; i < size; i++) {
			result += num.charAt(i)-'0';
		}

		System.out.println(result);
	}
}
