package solved.ac_class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class member implements Comparable<member>{
	int age;
	String name;
	int idx;
	public member(int age, String name,int idx) {
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
	@Override
	public int compareTo(member o) {
		if (this.age != o.age) return this.age-o.age;
		else {
			return this.idx-o.idx;
		}
	}

}

public class acmicpc_10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		member [] judge = new member[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			judge[i] = new member(Integer.parseInt(st.nextToken()), st.nextToken(),i);
		}
		Arrays.sort(judge);
		for (member m : judge) {
			System.out.println(m.age+" "+m.name);
		}
	}
}
