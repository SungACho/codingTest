package solve.baekjoon.String;

import java.util.Scanner;

public class T10809 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] array = str.toCharArray();

        for(int i = (int)'a'; i <= (int)'z' ; i ++) {
			int idx = -1;
			for(int j = 0; j < array.length; j++) {
				if(i == (int)array[j]) {
					idx = j;
					break;
				}
			}
			System.out.print(idx + " ");
		}
	}
}
