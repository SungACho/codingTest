package solve.baekjoon.basicMath1;
import java.io.*;

public class T2292 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println(1);
		}else {
			int minRoomNum = 1;
			int lastRoomNum = 1;
			
			for(int i = 1; i < N; i ++) {
				lastRoomNum += (i*6);
				
				if(minRoomNum <= N && N <= lastRoomNum) {
					System.out.println(i+1);
					break;
				}
				minRoomNum = lastRoomNum+1;
			}
		}
	}
}