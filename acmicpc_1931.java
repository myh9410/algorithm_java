package greedy;
//¿Œ≈Õπ˙ Ω∫ƒ…¡Ï∏µ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class meeting implements Comparable<meeting>{
	int start;
	int end;
	public meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(meeting o) {
		if (this.end == o.end) return this.start-o.start;
		return this.end - o.end;
	}
}


public class acmicpc_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		meeting [] meetings = new meeting[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			meetings[i] = new meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(meetings);
//		for (int i = 0; i < meetings.length; i++) {
//			System.out.println(meetings[i].start + " "+meetings[i].end);
//		}
		int bef=0,count = 1;
		for (int i = 0; i < meetings.length; i++) {
			if (i==0) {
				bef = meetings[i].end;				
			} else {
				if (meetings[i].start >= bef) {
					bef = meetings[i].end;
//					System.out.println(meetings[i].start+" "+meetings[i].end);
					count++;
				}
			}
		}
		System.out.println(count);
	}//end main
}//end class
