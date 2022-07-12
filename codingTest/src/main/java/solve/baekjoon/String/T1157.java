package solve.baekjoon.String;

import java.util.*;

public class T1157 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(topFrequent(str));
	}

	public static String topFrequent(String str) {
		if(str.length() == 1) return str.toUpperCase();

		Map<String, Integer> map = new HashMap<>();
		List<String>[] list = new List[str.length()];

		for(int i = 0 ; i < str.length(); i++) {
			String s = str.substring(i, i+1).toUpperCase();
			map.put(s,map.getOrDefault(s, 0)+1 );
		}

		for(int j = 0; j < str.length(); j++) {
			for(String key : map.keySet()) {
				if(map.get(key) == j) {
					if (list[j] == null) {
						list[j] = new ArrayList<>();
					}
					list[j].add(key);
				}
			}
		}

		for(int k = list.length-1; k>= 0 ; k-- ) {
			if(list[k] != null) {
				if(list[k].size()>1) {
					return "?";
				}else {
					return list[k].get(0);
				}
			}
		}
		return "";
	}
}
