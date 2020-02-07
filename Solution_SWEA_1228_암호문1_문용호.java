package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_SWEA_1228_암호문1_문용호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}
			int order = sc.nextInt(); // 명령어의 개수 입력받음
			sc.nextLine();
			String [] s = sc.nextLine().split("I");
			int x=0;
			int y=0;
			int nums=0;
			String [] tmp;
			for (int i = 1; i < s.length; i++) {
				s[i] = s[i].trim();
				tmp = s[i].split(" ");
//				System.out.println(Arrays.toString(tmp));
				x = Integer.parseInt(tmp[0]);
				y = Integer.parseInt(tmp[1]);
				int idx = 0;
				for (int j = 2; j < y+2; j++) {
					nums = Integer.parseInt(tmp[j]);
					list.add(x+idx++, nums);
				}
			}// end for (s.length)
			System.out.print("#"+t+" ");
			for (int i = 0; i < 10; i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
	}
}
