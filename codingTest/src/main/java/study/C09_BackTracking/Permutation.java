package study.C09_BackTracking;


import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(new Permutation().solve(nums));
	}
	int count =0;
	public List<List<Integer>> solve(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
		backtrack(result, tempList, nums, count);
		return result;
	}
	
	private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int count) {
		String space = "  ";
		StringBuilder sbBuilder = new StringBuilder();
		for(int i = 0; i < count; i ++) {
			sbBuilder.append(space);
		}
		
		System.out.println(sbBuilder.toString() + "backtrack -- result :"+ result + ", tempList : "+ tempList + ", count : "+count);
		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
			System.out.println(sbBuilder.toString() + "add result: "+result);
		} else {
			for (int i = 0; i < nums.length; i++) {
				System.out.println(sbBuilder.toString() + "for tempList: "+tempList + "/ nums["+i+"]:"+nums[i]);
				if (tempList.contains(nums[i])) {
				System.out.println(sbBuilder.toString() + "continue");
					continue; 
				}
					
				//System.out.println("i "+i);
				tempList.add(nums[i]);
				System.out.println(sbBuilder.toString() + "add tempList: "+tempList);
				backtrack(result, tempList, nums, count+1);
				tempList.remove(tempList.size() - 1);
				System.out.println(sbBuilder.toString() + "remove tempList: "+tempList);
			}
		}
		System.out.println(sbBuilder.toString() + "====end=====================");
	}
}
