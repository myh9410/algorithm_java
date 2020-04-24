package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class register{
	int val;
	String str = "";
	public register(int val, String str) {
		this.val = val;
		this.str = str;
	}
}

public class acmicpc_9019_시간뻑남 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			String input=br.readLine();
			int A=Integer.parseInt(input.split(" ")[0]); 
			int B=Integer.parseInt(input.split(" ")[1]);
			Queue<register> q = new LinkedList<register>();
			String status = "";
			int [] visit = new int [10000];
			q.add(new register(A, status));
			while(!q.isEmpty()) {
				register r = q.poll();
				int val = r.val;
				status = r.str;
				visit[val] = 1;
//				System.out.println(r.val+ " "+ r.str);
				if (val == B) {
					System.out.println(status);
					break;
				}
				//D - 2n mod 10000
				if (2*val > 9999 && visit[(2*val)%10000] == 0) 
					q.add(new register((2*val)%10000, status+"D"));
				else if (2*val < 10000 && visit[2*val] == 0)
					q.add(new register(2*val, status+"D"));
				
				//S - n-1 (n�� 0�̸� n= 9999
				if (val == 0 && visit[9999] == 0) 
					q.add(new register(9999, status+"S"));
				else if ( val-1 !=0 && visit[val-1] == 0) 
					q.add(new register(val-1, status+"S"));
				
				//L - �������� ���ڸ��� �а�, ���� ������ ���������� append
				int ln= (val%10)*10+(val/10%10)*100 +(val/100%10)*1000+(val/1000);
				if (visit[ln] == 0) 
					q.add(new register(ln, status+"L"));
				
				//R - ���������� ���ڸ��� �а�, ���� �������� ������ append
				int rn=(val%10)*1000+(val/10%10) +(val/100%10)*10+(val/1000)*100;
				if (visit[rn] == 0) 
					q.add(new register(rn, status+"R"));
			}
		}//end tc
	}//end main
}//end class
