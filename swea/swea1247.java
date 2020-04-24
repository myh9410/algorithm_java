package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class loc{
	int x;
	int y;
	public loc(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class swea1247 {
	static loc [] locArr;
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			min = Integer.MAX_VALUE;
			int N = Integer.parseInt(br.readLine());
			locArr = new loc[N+2];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			locArr[0] = new loc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			locArr[N+1] = new loc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			for (int i = 1; i < locArr.length-1; i++) {
				locArr[i] = new loc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			perm(N+2,1);
			System.out.println("#"+t+" "+min);
		}//end tc
	}//end main

	public static void perm(int r, int k) {
		if (r-1==k) {//����
			int sum = 0;
			for (int i = 1; i < r; i++) {
				sum += Math.abs(locArr[i].x-locArr[i-1].x)+Math.abs(locArr[i].y-locArr[i-1].y);
			}
			if (min > sum) min = sum;
			//System.out.println();
		} else {//���
			//0~k-1�� �̹� Ȯ��, �̼����� �� : k~������, ���߿��� k��°�� �� �� �ִ� ���ڸ� �����ϴ� �۾�
			for (int i = k; i < locArr.length-1; i++) {
				//i��° <-> k��° swap    arr[i]<-> arr[k]
				//swap(k,i);
				loc tmp = locArr[k];
				locArr[k] = locArr[i];
				locArr[i] = tmp;
				perm(locArr.length,k+1);
				//swap(k,i); => ����, ���� �۾��� ���ؼ� ���󺹱��ϴ� ����
				tmp = locArr[k];
				locArr[k] = locArr[i];
				locArr[i] = tmp;
			}
		}
	}
}//end class