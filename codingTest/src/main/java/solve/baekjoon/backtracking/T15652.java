package solve.baekjoon.backtracking;

import java.io.*;
import java.util.*;


public class T15652 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		printList(solve(N,M));
		
	}
	
	public static List<List<Integer>> solve(int N, int M) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		System.out.println("before result :" + result);
		backtrack(result, new ArrayList<Integer>(), N, M, 1);
		return result;
	}
	
	public static void backtrack(List<List<Integer>> result, ArrayList<Integer> tempList, int n, int k, int start) {
		if (tempList.size() == k) {
			result.add(new ArrayList<>(tempList));
	//	    System.out.println("add tempList: "+tempList);
		}else if (tempList.size() > k) {
		//	System.out.println("return tempList: "+tempList);
			return;
		}
		

		for (int i = start; i <= n; i++) {
			tempList.add(i);
			//System.out.println("22tempList: "+tempList);
			backtrack(result, tempList, n, k, i );
			tempList.remove(tempList.size() - 1);
			//System.out.println("remove tempList: "+tempList);
		}
	}
	
	public static void printList(List<List<Integer>> result) {
//		System.out.println("printList: "+result);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < result.size(); i++) {
			for(Integer num : result.get(i)) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}