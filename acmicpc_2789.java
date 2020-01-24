import java.util.Scanner;

public class acmicpc_2789 {
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] card = new int[N];
		int max = 0;
		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		//M에 최대한 가까운 카드 3장 찾기
		for (int i = 0; i < card.length; i++) {
			for (int j = i+1; j < card.length; j++) {
				for (int k = j+1; k < card.length; k++) {
					//M을 넘지 않으면서, M에 최대한 가까운 카드 3장의 합을 구하기
					if (card[i]+card[j]+card[k] <= M && max <= card[i]+card[j]+card[k]) {
						max = card[i]+card[j]+card[k];
					}
				}
			}
		}
		System.out.println(max);
		//구한 카드 3장의 합을 출력하기
	}//eom
}//eoc
