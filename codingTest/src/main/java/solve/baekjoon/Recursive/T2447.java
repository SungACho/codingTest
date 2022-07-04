package solve.baekjoon.Recursive;

import java.util.Scanner;

public class T2447 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		//System.out.println(Math.pow(3, 8)); // input 최대값 : 6561

		// [1. String Array로 풀기 ]
		String[] firstStar = {"***",
							  "* *",
							  "***"};

		if(num == 3) {
			printArray(firstStar);
		}else {
			String[] result = drawStringStar(firstStar, num);
			printArray(result);

		}

		// [2. 2dArray로 풀기 ] - 시간 초과로 1번으로 수정
//		String[][] firstArray = {
//									{"*","*","*"},
//									{"*"," ","*"},
//									{"*","*","*"}
//								};
//		if(num == 3) {
//			print2dArray(firstArray);
//		}else {
//			String[][] result = drawStar(firstArray,num);
//			print2dArray(result);
//		}
	}


	public static String[] drawStringStar(String[] beforeArray, int num) {
		String[] result = new String[beforeArray.length*3];
		int childRow = 0;
		StringBuilder sb = null;

		// 일단 자식 array 기준으로 *3 하여 그림 그리기
		for(int i = 0 ; i < result.length; i++) {
			String str = beforeArray[childRow];

			sb = new StringBuilder("");
			sb.append(str+str+str);
			result[i] = sb.toString();
			childRow++;
			if(childRow == beforeArray.length) {
				childRow = 0;
			}
		}
		// 가운데 부분 비우기
		for(int i = 0 ; i < result.length; i++) {
			if(result.length/3 <= i && i < result.length * 2 /3) {
				sb = new StringBuilder(result[i]);
				for(int j = 0 ; j < result.length ; j++) {
					if(result.length/3 <= j && j < result.length * 2 /3) {
						sb.setCharAt(j, ' ');
					}
				}
				result[i] = sb.toString();
			}
		}

		if(result.length == num) {
			return result;
		}else {
			return drawStringStar(result, num);
		}
	}

	public static void printArray(String[] array) {
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}


//	public static String[][] drawStar(String[][] beforeArray, int num) {
//		int beforeLen = beforeArray.length;
//		String[][] result = new String[beforeLen*3][beforeLen*3];
//		int chidRow = 0;
//		for(int i =0 ; i < result.length; i++) {
//			if(chidRow == beforeLen) {
//				chidRow = 0;
//			}
//			int chidCol = 0;
//
//			for(int j = 0 ; j < result.length ; j++) {
//				if(chidCol == beforeLen) {
//					chidCol = 0;
//				}
//				if((result.length/3) <= i && i <(result.length*2/3) && (result.length/3) <= j && j <(result.length*2/3)) {
//					result[i][j] = " ";
//				}else {
//					result[i][j] = beforeArray[chidRow][chidCol];
//				}
//
//				chidCol++;
//			}
//
//			chidRow++;
//		}
//
//		if(beforeLen*3 == num) {
//			return result;
//		}else {
//			return drawStar(result,num);
//		}
//
//	}

//	public static void print2dArray(String[][] array) {
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0 ; j <array.length; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println("");
//		}
//	}
}
