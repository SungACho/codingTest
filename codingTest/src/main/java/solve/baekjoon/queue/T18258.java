package solve.baekjoon.queue;

import java.io.*;
import java.util.*;

public class T18258 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> queue = new LinkedList<>();
		String line;
		String X;
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			line = br.readLine();
			
			if(line.indexOf("push") == 0) {
				X = line.split(" ")[1];
				queue.offer(Integer.parseInt(X));
			}else if("size".equals(line)) {
				bw.write(queue.size() + "\n");
				
			}else if("empty".equals(line)) {
				bw.write((queue.isEmpty()? 1 : 0) + "\n");
				
			}else if(queue.size() == 0) {
				bw.write("-1\n");
				
			}else {
				
				if("pop".equals(line)) {
					bw.write(queue.pop() +"\n");
					
				}else if("front".equals(line)) {
					bw.write(queue.getFirst() + "\n");
					
				}else if("back".equals(line)) {
					bw.write(queue.getLast() + "\n");
					
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}