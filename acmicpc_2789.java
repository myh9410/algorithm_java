import java.util.Scanner;

public class acmicpc_2789 {
	public static void main(String[] args) {
		//�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] card = new int[N];
		int max = 0;
		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}
		//M�� �ִ��� ����� ī�� 3�� ã��
		for (int i = 0; i < card.length; i++) {
			for (int j = i+1; j < card.length; j++) {
				for (int k = j+1; k < card.length; k++) {
					//M�� ���� �����鼭, M�� �ִ��� ����� ī�� 3���� ���� ���ϱ�
					if (card[i]+card[j]+card[k] <= M && max <= card[i]+card[j]+card[k]) {
						max = card[i]+card[j]+card[k];
					}
				}
			}
		}
		System.out.println(max);
		//���� ī�� 3���� ���� ����ϱ�
	}//eom
}//eoc
