package solve.baekjoon.basicMath1;

import java.io.*;
import java.math.*;

public class T10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		BigInteger A = new BigInteger(line[0]);
		BigInteger B = new BigInteger(line[1]);
		
		System.out.println(A.add(B));
	}
}