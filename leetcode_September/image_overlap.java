package leetcode_sep;

import java.util.Arrays;

public class image_overlap {
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
//		int [][] A = {{1,1,0},{0,1,0},{0,1,0}};
//		int [][] B = {{0,0,0},{0,1,1},{0,0,1}};
		int [][] A = {{0,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,0,1},{0,1,0,0,1}};
		int [][] B = {{1,0,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{0,1,1,1,1},{1,0,1,1,1}};
		int answer = sol.largestOverlap(A, B);
		System.out.println(answer);
	}
}

class Solution6{
	static int answer;
	public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        int [][] map = new int [N+2*(N-1)][N+2*(N-1)];
        answer = 0;
        
        for (int i = N-1; i < 2*N-1; i++) {
			for (int j = N-1; j < 2*N-1; j++) {
				map[i][j] = B[i-N+1][j-N+1];
			}
		}
        
        for (int i = 0; i <= map.length-N; i++) {
			for (int j = 0; j <= map.length-N; j++) {
				int [][] tmp = map.clone();
				fill(tmp,A,i,j,N);
			}
		}
		return answer;
    }
	private void fill(int[][] tmp, int [][] A, int x, int y, int N) {
		int cnt = 0;
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (tmp[i][j] + A[i-x][j-y] == 2) cnt++;
			}
		}
		if (answer < cnt) answer = cnt;
	}
}
