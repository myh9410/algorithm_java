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
		if (r-1==k) {//종료
			int sum = 0;
			for (int i = 1; i < r; i++) {
				sum += Math.abs(locArr[i].x-locArr[i-1].x)+Math.abs(locArr[i].y-locArr[i-1].y);
			}
			if (min > sum) min = sum;
			//System.out.println();
		} else {//재귀
			//0~k-1은 이미 확정, 미선택한 수 : k~끝까지, 그중에서 k번째에 들어갈 수 있는 숫자를 결정하는 작업
			for (int i = k; i < locArr.length-1; i++) {
				//i번째 <-> k번째 swap    arr[i]<-> arr[k]
				//swap(k,i);
				loc tmp = locArr[k];
				locArr[k] = locArr[i];
				locArr[i] = tmp;
				perm(locArr.length,k+1);
				//swap(k,i); => 원복, 다음 작업을 위해서 원상복귀하는 과정
				tmp = locArr[k];
				locArr[k] = locArr[i];
				locArr[i] = tmp;
			}
		}
	}
}//end class