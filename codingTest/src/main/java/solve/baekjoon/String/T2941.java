package solve.baekjoon.String;

import java.io.*;

public class T2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(cntWord(str));
	}
	
	public static int cntWord(String str) {
		int cnt = 0;
		
		for(int i = 0 ; i < 100; i++) {
				
			if(str.indexOf("c=") == 0 || str.indexOf("c-") == 0 || str.indexOf("d-") == 0 || 
			   str.indexOf("lj") == 0 || str.indexOf("nj") == 0 || str.indexOf("s=") == 0 || 
			   str.indexOf("z=") == 0) 
			{
				cnt++;
				if(str.length() == 2) {
					break;
				}else {
					str = str.substring(2, str.length());
				}
					
			}else if(str.indexOf("dz=") == 0 ) {
				cnt++;
				if(str.length() == 3) {
					break;
				}else {
					str = str.substring(3, str.length());
				}
			}else {
				cnt++;
				if(str.length() == 1) {
					break;
				}else {
					str = str.substring(1, str.length());
				}
			}
		}
		
		return cnt;
	}
}
