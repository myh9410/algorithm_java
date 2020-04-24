package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class swea1251_kruskal {
	static int [] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			island[] islands = new island[N];
			parent = new int [N];
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;
			}
			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {
				islands[n] = new island(Integer.parseInt(st.nextToken()),0,0);
			}
			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {
				islands[n].y = Integer.parseInt(st.nextToken());
			}
			double E = Double.parseDouble(br.readLine().trim());
			ArrayList<island> list = new ArrayList<island>();
			for (int i = 0; i < islands.length-1; i++) {
				for (int j = i+1; j < islands.length; j++) {
					list.add(new island(i, j, E*Math.pow(Math.sqrt(Math.pow(islands[j].x-islands[i].x, 2)+Math.pow(islands[j].y-islands[i].y, 2)),2)));
				}
			}//경우의 수 다해줌
			Collections.sort(list, new Comparator<island>() {
				public int compare(island o1, island o2) {
					if (o1.w < o2.w) return -1;
					else if (o1.w > o2.w) return 1;
					else return 0;
				}
			});
			double answer = 0;
			for (int i = 0; i < list.size(); i++) {
				if (!isSameParent(list.get(i).x,list.get(i).y)) {
					union(list.get(i).x, list.get(i).y);
					answer += list.get(i).w;
				}
			}
			System.out.printf("#"+t+" "+"%.0f\n",answer);
		}//end tc
	}//end main
	 public static boolean isSameParent(int x, int y){
	        x = findParent(x);
	        y = findParent(y);
	        if(x != y) return false;

	        return true;
	 }
	 
    public static int findParent(int x){
        if(parent[x] == x) return x;
        else
            return parent[x] = findParent(parent[x]);
    }

    public static void union(int x, int y){
        x = findParent(x);
        y = findParent(y);

        if(x != y){
            parent[y] = x;
        }
    }
}//end class

class island {
	int x;
	int y;
	double w;
	public island(int x, int y,double w) {
		this.x = x;
		this.y = y;
		this.w = w;
	}
}