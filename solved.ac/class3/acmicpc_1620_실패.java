package solved.ac_class3;

import java.util.HashMap;
import java.util.Scanner;
//바이너리 서치 트리로 구현하자 -아래코드 시간초과남
/*
public class acmicpc_1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 1; i <= N; i++) {
			map.put(i, sc.nextLine());
		}
		for (int i = 0; i < M; i++) {
			String s = sc.nextLine();
			boolean flag = true;
			for (int j = 0; j < s.length(); j++) {
				if (!Character.isDigit(s.charAt(j))) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(map.get(Integer.parseInt(s)));
			}else {
				for (Object o : map.keySet()) {
					if (map.get(o).equals(s)){
						System.out.println(o);
						break;
					}
				}
			}
		}
	}
}
*/

class pokemon{
	int num=0;
	String name="";
	public pokemon(int num, String name) {
		this.name = name;
		this.num = num;
	}
}

public class acmicpc_1620_실패 {
	public static pokemon[] BST;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		BST = new pokemon[1 << (N+1)];
		for (int i = 0; i < N; i++) {
			insert(new pokemon(i+1, sc.nextLine()));
		}
		for (int i = 0; i < BST.length; i++) {
			System.out.print(BST[i].num+" ");
		}
	}
	public static void insert(pokemon pokemon) {
		int node = 1;
		while (node < BST.length) {
			if (pokemon.num == BST[node].num)
				BST[node] = pokemon;
			else if (pokemon.num < BST[node].num){
				node*=2;
			} else {
				node=node*2+1;
			}
		}
	}
}

