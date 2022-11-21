package study.C09_BackTracking;

import java.util.*;

public class Combination {

	public static void main(String[] args) {
		int n = 3, k = 2;
		System.out.println(new Combination().solve(n,k));
	}

	public List<List<Integer>> solve(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		System.out.println("before result :" + result);
		backtrack(result, new ArrayList<Integer>(), 1, k, n);
		System.out.println("after result : "+ result);
		return result;
	}

	public void backtrack(List<List<Integer>> result, ArrayList<Integer> tempList, int start, int k, int n) {
		if (tempList.size() == k) {
			result.add(new ArrayList<>(tempList));
	//	    System.out.println("add tempList: "+tempList);
		}else if (tempList.size() > k) {
		//	System.out.println("return tempList: "+tempList);
			return;
		}
		

		for (int i = n; i >= start; i--) {
			tempList.add(i);
			System.out.println("22tempList: "+tempList);
			backtrack(result, tempList, start, k, i - 1);
			tempList.remove(tempList.size() - 1);
			//System.out.println("remove tempList: "+tempList);
		}
	}
}
