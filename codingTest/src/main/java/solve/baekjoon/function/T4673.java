package solve.baekjoon.function;

import java.io.*;

public class T4673 {
	static boolean[] list = new boolean[10001];
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		list[0] = false;
		
		for(int i = 1; i <= list.length; i++) {
			isSelfNum(i);
		}
		
		for(int j = 1; j <list.length; j++) {
			if(!list[j]) {
				bw.write(j+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void isSelfNum(int N) {
		int temp = N;
		int result = N;
		
		while(temp >0) {
			result += temp%10;
			temp /= 10;
		}
		if(result < list.length) {
			list[result] = true;
		}
	}
}