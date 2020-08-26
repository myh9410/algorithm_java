import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//5557 - 1학년
public class acmicpc_5557 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String [] tmp = br.readLine().split(" ");
		int [] arr = new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}
		long [][] dp = new long[N-1][21]; // 가짓수를 체크
		dp[0][arr[0]] = 1;
		for (int i = 1; i < N-1; i++) {
			for (int j = 0; j <= 20; j++) {
				if (dp[i-1][j] != 0) {
					if (j+arr[i] <= 20) dp[i][j+arr[i]] +=dp[i-1][j];
					if (j-arr[i] >= 0) dp[i][j-arr[i]] +=dp[i-1][j];
				}
			}
		}
//		for (int i = 0; i < dp.length; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
		System.out.println(dp[N-2][arr[N-1]]);
		
	}
}
