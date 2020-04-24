package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���ݸ��� ������
//Ÿ�ӿ���
public class swea9282 {
	static int [][] map;
	static int result;
	static int n,m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			map = new int [n][m];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int idx = 0;
				while(st.hasMoreTokens()) {
					map[i][idx++] = Integer.parseInt(st.nextToken());
				}
			}
			result = dfs(0,0,n,m, Integer.MAX_VALUE);
			System.out.println("#"+t+" "+result);
		}//end tc
	}//end main
	private static int dfs(int y, int x, int h, int w,int min) {
		if (w == 1 && h == 1) {
			return 0;
		}
		//������ �ִ� ����� ������ ������ŭ ������ ����
		int sum = 0;
		for (int i = y; i < y+h; i++) {
			for (int j = x; j < x+w; j++) {
				sum+=map[i][j];
			}
		}
		//���η� ������ �ּҺ���� ���Ѵ�
		for (int i = 1; i < h; i++) {
			//���ʺ��
			int sum1 = dfs(y,x,i,w,min);
			//�Ʒ��ʺ��
			int sum2 = dfs(y+i,x,h-i,w,min);
			//�� ������ ��
			int sum3 = sum+sum1+sum2;
			min = Math.min(min, sum3);
		}
		//���η� ������ �ּҺ���� ���Ѵ�.
		for (int i = 1; i < w; i++) {
			//���� ���
			int sum1 = dfs(y,x,h,i,min);
			//������ ���
			int sum2 = dfs(y,x+i,h,w-i,min);
			int sum3 = sum+sum1+sum2;
			min = Math.min(min, sum3);
		}
		
		return min;
	}
}//end class
