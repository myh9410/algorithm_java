package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_15989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		int T = Integer.parseInt(st.nextToken());
		int n = 0;
		int [] nums = {1,2,3};
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine(),"");
			n = Integer.parseInt(st.nextToken());
			int [] d = new int [n+1];
			d[0] = 1;
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j <=n; j++) {
					if (j-nums[i] >= 0) {
						d[j]+=d[j-nums[i]];
					}
				}
			}
			System.out.println(d[n]);
		}//end tc
	}//end main
}//end class
