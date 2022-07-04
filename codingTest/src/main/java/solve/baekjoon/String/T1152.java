package solve.baekjoon.String;

import java.util.Scanner;

public class T1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] array = str.split(" ");
		int cnt = 0;

		for(int i = 0; i < array.length; i++) {
			if(!"".equals(array[i])) cnt++;
		}
		System.out.println(cnt);
	}
}
