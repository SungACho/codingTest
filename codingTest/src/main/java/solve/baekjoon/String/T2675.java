package solve.baekjoon.String;

import java.io.IOException;
import java.util.Scanner;

public class T2675 {
	public static void main(String[] args) throws IOException { 
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		System.out.println("");
		
		if(0 <=T && T <=1000) {
			for(int c = 0; c < T; c++) {
				int R = sc.nextInt();
				String S = sc.next();
				if(" ".equals(S) || R<1 ||R > 8) {
					continue;
				}

				char[] array = S.toCharArray();
				if(array.length > 20) {
					continue;
				}
				String res = "";
				
				for(int i = 0; i < array.length; i ++) {
					res.repeat(R);
				}
				System.out.print(res);
			}
		}
	}
	
}
