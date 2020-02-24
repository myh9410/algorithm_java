package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class acmicpc_2630 {
	static int N;
	static int [][] map;
	static boolean [][] checker;
	static int blue = 0;
	static int white = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		N = Integer.parseInt(st.nextToken());
		map = new int [N][N];
		checker = new boolean [N][N];
		boolean check1 = true; //전부 1 파란색 
		boolean check0 = true; //전부 0 하얀색 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int index = 0;
			while(st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp == 1) {
					check0 = false;
				} else {
					check1 = false;					
				}
				map[i][index++] = tmp;
			}
		}//입력
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}
		
		if (check1 && !check0) { // 전부 파란색일때 
			System.out.println(0); 
			System.out.println(1); 
		} else if (!check1 && check0) { // 전부 하얀색일때 
			System.out.println(1); 
			System.out.println(0); 			
		} else if (!check1 && !check0) {
			//나눠서 확인 
			search(0,N/2,0,N/2,N/2);
			search(0,N/2,N/2,N,N/2);
			search(N/2,N,0,N/2,N/2);
			search(N/2,N,N/2,N,N/2);
		}
		System.out.println(white);
		System.out.println(blue);
	}//end main
	public static void search(int start_x, int end_x, int start_y, int end_y,int N) {
//		System.out.println("x시작 : "+ start_x+" x끝 : "+end_x+" y시작 : "+start_y+" y끝 : "+end_y+" N: "+N);
//		System.out.println("파 : "+blue+" 흰 : "+white);
		if (N==1) {
			if (map[start_x][start_y] == 1) {
				blue++;
				return;
			}
			else {
				white++;
				return;
			}
		}
		boolean c1 = true;
		boolean c0 = true;
		for (int i = start_x; i < end_x; i++) {
			for (int j = start_y; j < end_y; j++) {
				if (map[i][j] == 1) c0 = false;
				else c1 = false;
			}
		}
		if (c1 && !c0) {
			blue++;
			return;
		} else if (!c1 && c0) {
			white++;
			return;
		} else if (!c1 && !c0) {
			N/=2;
			search(start_x,start_x/2+end_x/2,start_y,start_y/2+end_y/2,N);
			search(start_x,start_x/2+end_x/2,start_y/2+end_y/2,end_y,N);
			search(start_x/2+end_x/2,end_x,start_y,start_y/2+end_y/2,N);
			search(start_x/2+end_x/2,end_x,start_y/2+end_y/2,end_y,N);
		}
	}
}//end class
