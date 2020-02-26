package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_5585 {
	public static void main(String[] args) throws IOException {
		//500 100 50 10 5 1¿£
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int money = 1000 - Integer.parseInt(st.nextToken());
		int count = 0;
		if (money/500 >=1) {
			count+= money/500;
			money = money%500;
		}
		if (money/100 >=1) {
			count+= money/100;
			money = money%100;
		}
		if (money/50 >=1) {
			count+= money/50;
			money = money%50;
		}
		if (money/10 >=1) {
			count+= money/10;
			money = money%10;
		}
		if (money/5 >=1) {
			count+= money/5;
			money = money%5;
		}
		if (money/1 >=1) {
			count+= money/1;
		}
		System.out.println(count);
	}
}
