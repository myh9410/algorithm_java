package 문자열처리;

import java.util.Arrays;
import java.util.Scanner;

//Knuth, Morris, Prett
public class acmicpc_1701_KMP응용 {
	// 실패테이블
	static int getPi(String pattern) {
		// 접두사와 접미사가 일치하는 최대길이를 담을 배열 선언
		int[] pi = new int[pattern.length()];
		int max=0;
		int j = 0;
		// i,j가 가리키는 값이 일치하면 둘다 증가
		// 불일치하면 i만 증가시켜야 하므로 for문
		for (int i = 1; i < pattern.length(); i++) {
			while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
				j = pi[j - 1];
			}
			if (pattern.charAt(i) == pattern.charAt(j)) {
				max = Math.max(max,pi[i] = ++j);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			max = Math.max(max, getPi(s.substring(i,s.length())));
		}
		System.out.println(max);
	}

}


//getpi
//int [] pi = new int [pattern.length()];
//int j=0;
//for (int i = 1; i < pattern.length(); i++) {
//	while (j > 0 & pattern.charAt(i) != pattern.charAt(j)) {
//		j = p[j-1];
//	}
//	if (pattern.charAt(i) == pattern.cahrAt(j));
//	pi[i] = ++j;
//}