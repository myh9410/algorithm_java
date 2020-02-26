package bruteforce;
//버퍼드리더는 런타임에러나는데,,
//스캐너는 에러 안남;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmicpc_1107 {
	static boolean [] check = new boolean [10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		int N = Integer.parseInt(st.nextToken());//이동하고자하는 채널
		st = new StringTokenizer(br.readLine(),"");
		int M = Integer.parseInt(st.nextToken());//고장난 버튼의 갯수
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < M; i++) {
			check[Integer.parseInt(st.nextToken())] = true;
		}
		int ans = N-100; // 숫자버튼을 누르지 않는 경우를 먼저 처리
		if (ans < 0) {
			ans = -ans;
		} //절댓값 처리
		
		for (int i = 0; i <= 1000000; i++) {
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = c - N;
				if (press < 0) press = -press;
				if (ans > len + press) ans = len + press;
			}
		}
		System.out.println(ans);
	}//end main
	
	public static int possible(int c) {
		if (c==0) {
			if (check[0]) return 0;
			else return 1;
		}
		int len = 0;
		while (c > 0) {
			if (check[c%10]) return 0;
			len += 1;
			c /= 10;
		}
		return len;
	}//end possible
	
}//end class
