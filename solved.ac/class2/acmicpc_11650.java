package solved.ac_class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class point implements Comparable<point>{
	int x;
	int y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(point o) {
		if (this.x != o.x) return this.x-o.x;
		else {
			return this.y-o.y;
		}
	}

}

public class acmicpc_11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		point [] a = new point[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			a[i] = new point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(a);
		for (point p : a) {
			System.out.println(p.x+" "+p.y);
		}
	}
}
