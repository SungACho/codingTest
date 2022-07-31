package solve.baekjoon.basicMath1;
import java.io.*;

public class T10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T; i++) {
			String[] line = br.readLine().split(" ");
			int H = Integer.parseInt(line[0]);
			int N = Integer.parseInt(line[2]);

			int floor = (N%H)*100;
			int room = (N/H)+1;
			
			if(floor == 0) {
				floor = H*100;
				room -= 1;
			}
			System.out.println(floor+room);
		}
		br.close();
	}
}