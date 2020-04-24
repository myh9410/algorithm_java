package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class acmicpc_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		char [] tmp = st.nextToken().toCharArray();
		Arrays.sort(tmp);
		for (int i = tmp.length-1; i >=0; i--) {
			System.out.print(tmp[i]);
		}
	}
}
