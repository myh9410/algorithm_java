package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class acmicpc_1197 {
	static int v,e;
	static int [] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int answer=0;
		PriorityQueue<graph> list = new PriorityQueue<graph>(new Comparator<graph>() {
			public int compare(graph o1, graph o2) {
				if (o1.w < o2.w) return -1;
				else if (o1.w > o2.w) return 1;
				else return 0;
			}
		});
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		for (int i = 0; i < e; i++) {
		st = new StringTokenizer(br.readLine());
		list.add(new graph(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		for (int i = 0; i < e; i++) {
			graph g = list.poll();
			int x = find(g.x);
			int y = find(g.y);
			if (x == y) continue;
			union(x,y);
			answer+=g.w;
		}
		System.out.println(answer);
	}
	 public static int find(int a) {
	        if(a == parent[a]) return a;
	        parent[a] = find(parent[a]);
	        return parent[a];
	    }
	    
	    public static void union(int a,int b) {
	        int aRoot = find(a);
	        int bRoot = find(b);
	        
	        if(aRoot != bRoot) {
	            parent[aRoot] = b;
	        } else {
	            return;
	        }
	    }
}

class graph{
	int x;
	int y;
	int w;
	public graph(int x, int y, int w) {
		this.x = x;
		this.y = y;
		this.w = w;
	}
	
}