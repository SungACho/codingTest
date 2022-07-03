package C01_String;

public class substring {

	public static void main(String[] args) {
		String str[] = { "test", "teacher" };
		System.out.println(new substring().solve(str));
		
	}


	public String solve(String[] strs) {
		if (strs.length == 0)
			return "";
		String firstStr = strs[0];
		for (int i = 1; i < strs.length; i++) {
			
			while (strs[i].indexOf(firstStr) != 0) {
			
				firstStr = firstStr.substring(0, firstStr.length() - 1);
		
			}
		
		}
		return firstStr;
	}
}
