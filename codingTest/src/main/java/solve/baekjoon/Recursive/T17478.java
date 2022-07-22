package solve.baekjoon.Recursive;

import java.io.*;

public class T17478 {
	static String q = "\"재귀함수가 뭔가요?\"\n";
	static String a1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
	static String a2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
	static String a3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
	static String al = "라고 답변하였지.\n";
	static StringBuilder head = new StringBuilder();
	static StringBuilder tail = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(recursiveFunction(0, N));
	}


	public static String recursiveFunction(int curN, int N) {
		String underBar = "";
		
		if(curN == 0) {
			head.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
			
		}else {
			for(int i = 1; i <= curN; i++) {
				underBar += "____";
			}
		}
		
		if(curN == N) {
			head.append(underBar + q);
			tail.insert(0,underBar + al);
			tail.insert(0,underBar + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			
			return head.toString()+tail.toString();
		}else {
			head.append(underBar + q);
			head.append(underBar + a1);
			head.append(underBar + a2);
			head.append(underBar + a3);
			tail.insert(0, underBar + al);
			
			return recursiveFunction(curN+1, N);
			
		}
	}
}