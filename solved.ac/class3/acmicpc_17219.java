package solved.ac_class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class acmicpc_17219 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); //입력값 수
		int M = Integer.parseInt(st.nextToken()); // 정답 수
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			map.put(st.nextToken(), st.nextToken());
		}
		String [] tmp = new String [M];
		for (int i = 0; i < M; i++) {
			tmp[i] = br.readLine();
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(map.get(tmp[i]));
		}
	}
}
