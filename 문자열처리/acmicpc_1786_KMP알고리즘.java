package 문자열처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class acmicpc_1786_KMP알고리즘 {
	static int n,m;
	static int cnt;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static String s,p;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		p = br.readLine();
		KMP(s,p);
		System.out.println(cnt);
		for (Integer i : list) {
			System.out.println(i);
		}
	}
	static int[] getPi(String pattern) {
		int[] pi = new int[pattern.length()];
		// idx 1
		int j = 0;
		for (int i = 1; i < pattern.length(); i++) {
			while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
				j = pi[j - 1];
			}
			if (pattern.charAt(i) == pattern.charAt(j)) {
				pi[i] = ++j;
			}
		}

		return pi;
	}
	static void KMP(String parent, String pattern) {
		int[] table = getPi(pattern);
		int j = 0; 
		for(int i = 0 ; i< parent.length(); i++) {
			while(j >0 && parent.charAt(i) != pattern.charAt(j)) {
				j = table[j - 1];
			}
			if(parent.charAt(i) == pattern.charAt(j)) {
				if(j == pattern.length()-1) {
					cnt++;
					list.add(i-pattern.length()+2);
					j = table[j];
				}else {
					j++;
				}
			}
		}
	}
}
