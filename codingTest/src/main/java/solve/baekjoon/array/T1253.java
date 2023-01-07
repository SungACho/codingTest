package solve.baekjoon.array;

import java.io.*;
import java.util.Arrays;

public class T1253 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" "); 
		int[] array = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			array[i] = Integer.parseInt(line[i]);
		}
		
		Arrays.sort(array);
		int findNum, x, y;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			findNum = array[i];
			x = 0;
			y = N - 1 ;

			while(x < y) {
				if(array[x] + array[y] == findNum) {
					if(i == x)
                        x++;
                    else if(y == i)
                        y--;
                    else{
                        sum++;
                        break;
                    }
				}
				
				if(array[x] + array[y] > findNum) {
					y--;
				}else if(array[x] + array[y] < findNum) {
					x++;
				}
			}
		}
		System.out.println(sum);
		
	}
}
