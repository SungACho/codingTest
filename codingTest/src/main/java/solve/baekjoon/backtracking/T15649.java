package solve.baekjoon.backtracking;

import java.io.*;
import java.util.*;

public class T15649 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		
		solve(N, M);
		
	}
	
	public static void solve(int N, int M) {
		List<Integer> tempList = new ArrayList<>();
		List<List<Integer>> resultList = new ArrayList<>();
		
		resultList = backtracking(N, M, tempList, resultList);
		printList(resultList);
	}
	
	public static List<List<Integer>>  backtracking(int N, int M, List<Integer> tempList, List<List<Integer>> result) {
//		System.out.println("tempList : " + tempList);
		
		if(tempList.size() == M) {
//			System.out.println("before result" + result);
//			System.out.println("before tempList" + tempList);
			result.add(new ArrayList<>(tempList));
//			System.out.println("after result" + result);
		}else {
			for(int i = 1 ; i <= N; i++) {
				if(tempList.contains(i)) {
//					System.out.println("continue");
					continue;
				}
				tempList.add(i);
				backtracking(N, M, tempList, result);
				tempList.remove(tempList.size()-1);
			}
		}
		return result;
//		System.out.println("result : " + result);
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