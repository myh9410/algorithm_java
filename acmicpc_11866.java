package bruteforce;

import java.util.LinkedList;
import java.util.Scanner;

public class acmicpc_11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		//System.out.println(list); 저장내용 확인
		int index = K-1;
		System.out.print("<");
		while(true) {
			if (list.size() == 1) System.out.println(list.get(index)+">");
			else System.out.print(list.get(index)+", ");
			list.remove(index);
			if (list.size() <= 0) {
				break;
			}
			index = (index+(K-1)) % list.size();
		}
	}//end of main
}// end of class