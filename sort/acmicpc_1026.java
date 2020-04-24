package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class acmicpc_1026{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int [] a = new int [N];
		int [] b = new int [N];
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum+= a[i]*b[b.length-1-i];
		}
		System.out.println(sum);
	}
}
