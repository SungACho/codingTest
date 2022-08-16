package solve.baekjoon.print;
import java.io.*;

public class T3003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cntList = {1, 1, 2, 2, 2, 8};
		String[] line = br.readLine().split(" ");
		
		for(int i = 0; i < 6; i++) {
			bw.write((cntList[i] - Integer.parseInt(line[i]))+" ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}