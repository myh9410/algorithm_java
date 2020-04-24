package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class problem1 {
	static int N,M,K;
	static int [][][] stickers;
	static int [][] notebook;
	static Stack<int [][]> s;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//map의 x,y길이
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		stickers = new int [K][][];
		notebook = new int [N][M];
		for (int k = 0; k < K; k++) {
			st = new StringTokenizer(br.readLine()," ");
			//stickers[i] 의 x,y 길이
			int tmp_x = Integer.parseInt(st.nextToken());
			int tmp_y = Integer.parseInt(st.nextToken());
			int [][] tmp = new int [tmp_x][tmp_y];
			for (int i = 0; i < tmp_x; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < tmp_y; j++) {
					tmp[i][j] = Integer.parseInt(st.nextToken());
				}
				stickers[k] = tmp;
			}
		}//end stickers input
		DFS(notebook,stickers[0],0,0);//스티커 인덱스, 회전 인덱스
		System.out.println(ans);	
	}//end main
	
	private static void DFS(int[][] notebook, int[][] sticker, int si, int ri) {
		
		for (int i = 0; i < N-sticker.length; i++) {
			for (int j = 0; j < M-sticker[0].length; j++) {
				boolean check = true;
				for (int k = 0; k < sticker.length; k++) {
					for (int l = 0; l < sticker[k].length; l++) {
//						sticker[k][l];
					}
				}
				
			}
		}
	}

	private static int[][] rotate(int[][] sticker,int ri) {
		int y= sticker.length;
		int x = sticker[0].length;
		int [][] tmp = new int [x][y];
		switch (ri) {
		case 1: //90도
			System.out.println("회전 90");
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					tmp[i][j] = sticker[tmp[i].length-1-j][i];
				}
			}
			break;
		
		case 2://180도
			System.out.println("회전 180");
			for (int i = sticker.length-1; i >=0; i--) {
				for (int j = 0; j < sticker[i].length; j++) {
					tmp[j][sticker.length-1-i] = sticker[i][j];
				}
			}
			break;
		
		case 3://270도
			System.out.println("회전 270");			
			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					tmp[i][j] = sticker[tmp[i].length-1-j][i];
				}
			}
			break;
		case 4: //다시 기존으로
			return sticker;
		}
		return tmp;
	}
}//end class
