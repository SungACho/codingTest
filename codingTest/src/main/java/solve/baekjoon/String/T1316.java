package solve.baekjoon.String;

import java.util.*;

public class T1316 {

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for(int i = 0; i < num ; i++) {
            list.add(sc.next());
        }


        for(int i = 0; i < num; i ++) {
        	if(countGroupWord(list.get(i))) {
        		result++;
        	}
        }
        sc.close();

        System.out.println(result);
    }

	public static boolean countGroupWord(String str) {

		String beforeWord = "";
		Map<String, Integer> map = new HashMap<>();

		for(int j = 0 ; j < str.length(); j ++) {
			String s = str.substring(j, j+1);
			if(j==0) {
				beforeWord = s;
				map.put(s , 1);
			}else {
				// 이전 문자랑 달라진 순간 이미 map에 있으면 그룹단어 아님
				if(!s.equals(beforeWord)) {
					if(map.containsKey(s)) {
						return false;
					}
				}
				beforeWord = s;
				map.put(s, map.getOrDefault(s, 0)+1);
			}
		}

		return true;
	}

}
