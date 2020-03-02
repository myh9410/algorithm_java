package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class subin{
	int loc;
	int time;
	public subin(int loc,int time) {
		this.loc = loc;
		this.time = time;
	}
}

public class acmicpc_1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] visit = new int [100001];
		int N = sc.nextInt();
		int K = sc.nextInt();
		Queue<subin> q = new LinkedList<subin>();
		int time=0;
		q.add(new subin(N,time));
		while(!q.isEmpty()) {
			subin s = q.poll();
			int cur = s.loc;
			int ctime = s.time;
			visit[cur] = 1;
			if (cur == K) {
				System.out.println(ctime);
				break;
			} else {
				if (cur-1 >= 0 && visit[cur-1] == 0) q.add(new subin(cur-1,ctime+1));
				if (cur+1 <100001 && visit[cur+1] == 0) q.add(new subin(cur+1,ctime+1));
				if (cur*2 < 100001 && visit[cur*2] == 0) q.add(new subin(cur*2,ctime+1));
			}
		}
	}//end main
}//end class
