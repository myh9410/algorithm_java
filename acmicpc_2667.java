package algo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pointer{
	int x;
	int y;
	public Pointer(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

public class acmicpc_2667 {
	static int [][] map;
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	static boolean [][] visited;
	static Queue<Pointer> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int [N+2][N+2];
		visited = new boolean [N+2][N+2];
		sc.nextLine();
		for (int i = 1; i < map.length-1; i++) {
			String [] s= sc.nextLine().split("");
			for (int j = 0; j < s.length; j++) {
				map[i][j+1] = Integer.parseInt(s[j]);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				q = new LinkedList<Pointer>();
				if (map[i][j] == 1 && visited[i][j] == false) {
					visited[i][j] = true;
					q.offer(new Pointer(i,j));
					search(i,j);
				}
				if (!q.isEmpty()) {
					list.add(q.size());
					count++;
				}
			}//end inner for
		}//end outer for
		list.sort(null);
		System.out.println(count);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}//end main
	public static void search(int x,int y) {
		//구분 조건
		for (int k = 0; k < dx.length; k++) {
			int nx = x+dx[k];
			int ny = y+dy[k];
			if (map[nx][ny]== 0) continue;
			if (map[nx][ny]== 1 && visited[nx][ny] == false) {
				visited[nx][ny] = true;
				q.offer(new Pointer(nx,ny));
				search(nx,ny);
			}
		}
	}//end dfs
	
}//end class
