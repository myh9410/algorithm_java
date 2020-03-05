package solved.ac_class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class acmicpc_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String tmp = br.readLine();
			if (set.contains(tmp)) list.add(tmp);
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (String ss : list) {
			System.out.println(ss);
		}
	}//end main
}//end class