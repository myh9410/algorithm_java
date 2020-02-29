package solved.ac_class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class acmicpc_1181 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			set.add(s);
		}
		ArrayList<String> list = new ArrayList(set);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) return o1.length()-o2.length();
				else {
					int num = 0;
					for (int i = 0; i < o1.length(); i++) {
						if (o1.charAt(i) == o2.charAt(i)) continue;
						else {
							num = o1.charAt(i) - o2.charAt(i);
							break;
						}
					} return num;
				}
			}
		});
		for (String word : list) {
			System.out.println(word);
		}
	}//end main
}//end class
