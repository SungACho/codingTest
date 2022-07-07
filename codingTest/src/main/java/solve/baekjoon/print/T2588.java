package solve.baekjoon.print;

import java.util.Scanner;

public class T2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		String num2 = sc.next();

		for(int i = 2; i >= 0 ; i--) {
			System.out.println((num2.toCharArray()[i]-'0') *num1);
		}
		System.out.println(num1*Integer.parseInt(num2));
	}
}
