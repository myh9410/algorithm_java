package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//다항식 계산
public class swea9659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		final long q = 998244353;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			long [] ans = new long [51]; //M행,N열
			int [] tarr = new int [N+1];
			int [] aarr = new int [N+1];
			int [] barr = new int [N+1];
			for (int i = 2; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				tarr[i] = Integer.parseInt(st.nextToken());
				aarr[i] = Integer.parseInt(st.nextToken());
				barr[i] = Integer.parseInt(st.nextToken());			
			}
			int M = Integer.parseInt(br.readLine());
			long [] xarr = new long[M];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				xarr[i] = Long.parseLong(st.nextToken());
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < xarr.length; i++) {
				long x = xarr[i];
				ans[0] = 1;
				ans[1] = x;
				for (int j = 2; j <= N; j++) {
					int t = tarr[j];
					int a = aarr[j];
					int b = barr[j];
					if (t==1) {
						ans[j] = (ans[a]%q+ans[b]%q)%q; 
					}else if (t==2) {
						ans[j] = (a%q*ans[b]%q)%q; 
					} else {//t==3
						ans[j] = (ans[a]%q*ans[b]%q)%q; 
					}
				}
				System.out.print(ans[N]+" ");
			}
			System.out.println();
//			for (int i = 0; i < ans.length; i++) {
//				System.out.println(Arrays.toString(ans[i]));
//			}
//			System.out.println();
		}//end tc
	}
}