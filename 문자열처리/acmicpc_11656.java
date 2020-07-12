package 문자열처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class acmicpc_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			String tmp = s.substring(i, s.length());
			list.add(tmp);
		}
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String ans : list) {
			System.out.println(ans);
		}
	}
}
