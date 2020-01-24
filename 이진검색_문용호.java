import java.util.Scanner;

public class 이진검색_문용호 {
	public static boolean binarySearch(int[] arr,int key) {
		int s = 0;
		int e = arr.length-1;
		int m = 0;
		while (s<=e) {
			m = (s+e)/2;
			if (arr[m] == key) {
				return true;
			}
			else if (arr[m] > key) {
				e = m-1;
			} else s= m+1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,7,9,11,19,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 숫자 입력 : ");
		int key = sc.nextInt();
		int s = 0;				//시작점
		int e = arr.length-1;	//종료점
		int m = 0;				//중간key값
		System.out.println(binarySearch(arr,key));
//		boolean find = false;
//		while(s<=e) {
//			m = (s+e)/2;
//			if(arr[m] == key) {
//				find = true;
//				break;
//			}
//			else if (arr[m] > key) {
//				e = m-1;
//			}
//			else s = m+1;
//		}
//		System.out.println(find);
	}
}
