package solved.ac_class2;

import java.util.Scanner;

//숫자 카드2
public class acmicpc_10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] cards = new int [20000001];
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			cards[10000000+tmp]++;
		}
		int M = sc.nextInt();
		int [] searchfrom = new int [M];
		for (int i = 0; i < searchfrom.length; i++) {
			searchfrom[i] = sc.nextInt();
		}
		for (int i = 0; i < searchfrom.length; i++) {
			if (i ==searchfrom.length-1) System.out.print(cards[10000000+searchfrom[i]]);
			else System.out.print(cards[10000000+searchfrom[i]]+" ");
		}
	}//end main
}//end class
