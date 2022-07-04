package solve.baekjoon.String;

import java.util.Scanner;

public class T8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		String[] array = new String[size];

		for(int i = 0; i < size; i++) {
			array[i] = sc.next();
		}


		for(int j = 0 ; j < size; j++) {
			char[] strArray = array[j].toCharArray();
			int sum = 0;
			int score = 1;

			for(int k = 0 ; k <  strArray.length; k++ ) {
				if(strArray[k] == 'O') {
					sum += score;
					score++;
				}else {
					score = 1;
				}

			}

			System.out.println(sum);
		}

	}
}
