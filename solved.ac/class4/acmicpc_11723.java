package solved.ac_class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class acmicpc_11723 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder answer = new StringBuilder();
		Set<Integer> set = new HashSet<Integer>();
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("add")) {
				set.add(Integer.parseInt(st.nextToken()));
			} else if (s.equals("check")) {
				if (set.contains(Integer.parseInt(st.nextToken()))) {
					answer.append("1\n");
				} else {
					answer.append("0\n");
				}
			} else if (s.equals("remove")) {
				int tmp = Integer.parseInt(st.nextToken());
				if (set.contains(tmp)) set.remove(tmp);
			} else if (s.equals("toggle")) {
				int tmp = Integer.parseInt(st.nextToken());
				if (set.contains(tmp)) set.remove(tmp);
				else set.add(tmp);
			} else if (s.equals("all")) {
				set.clear();
				set.add(1); set.add(2); set.add(3); set.add(4); set.add(5); set.add(6); set.add(7); set.add(8); set.add(9); set.add(10);
				set.add(11); set.add(12); set.add(13); set.add(14); set.add(15); set.add(16); set.add(17); set.add(18); set.add(19); set.add(20);
			} else if (s.equals("empty")) {
				set.clear();
			}
		}
		System.out.println(answer);
	}
}
