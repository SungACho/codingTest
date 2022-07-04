package solve.baekjoon.Recursive;

import java.util.Scanner;

public class T2447 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String[][] firstArray = {
									{"*","*","*"},
									{"*"," ","*"},
									{"*","*","*"}
								};
		if(num == 3) {
			print(firstArray);
		}else {
			String[][] result = drawStar(firstArray,num);
			print(result);
		}
	}

	public static String[][] drawStar(String[][] beforeArray, int num) {
		int beforeLen = beforeArray.length;
		String[][] result = new String[beforeLen*3][beforeLen*3];
		int chidRow = 0;
		for(int i =0 ; i < result.length; i++) {
			if(chidRow == beforeLen) {
				chidRow = 0;
			}
			int chidCol = 0;

			for(int j = 0 ; j < result.length ; j++) {
				if(chidCol == beforeLen) {
					chidCol = 0;
				}
				if((result.length/3) <= i && i <(result.length*2/3) && (result.length/3) <= j && j <(result.length*2/3)) {
					result[i][j] = " ";
				}else {
					result[i][j] = beforeArray[chidRow][chidCol];
				}

				chidCol++;
			}

			chidRow++;
		}

		if(beforeLen*3 == num) {
			return result;
		}else {
			return drawStar(result,num);
		}

	}

	public static void print(String[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j <array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
}
