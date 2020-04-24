package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class acmicpc_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(st.nextToken());
		int [] counting = new int [10001];
		int [] input = new int [N];
		int [] output = new int [N];
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			tmp = Integer.parseInt(st.nextToken());
			input[i] = tmp; 
			counting[tmp]++;
		}//input값 배열에 저장, counting배열의 값 1씩 증가
		
		for (int i = 0; i < counting.length-1; i++) {
			counting[i+1] += counting[i];
		}//counting array의 숫자값 증가
		for (int i = input.length-1; i >=0; i--) {
			output[--counting[input[i]]] = input[i];
		}
		for (int i = 0; i < output.length; i++) {
			bw.write(output[i]+"\n");
		}
		br.close();
		bw.close();
	}//end main
}//end class
