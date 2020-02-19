package algo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Truck {
	int weight;
	int time;
	public Truck(int weight, int time) {
		this.weight = weight;
		this.time = time;
	}
}
public class acmicpc_13335 {
	static Queue<Truck> bridge;
	static int L;
	static int tidx;
	static int [] truck;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		L = sc.nextInt();
		truck = new int [n];
		bridge = new LinkedList<Truck>();
		for (int i = 0; i < truck.length; i++) {
			truck[i] = sc.nextInt();
		}//입력 
		tidx=0;
		int time=0;
		while (tidx < truck.length) {
			time++;
			
			if (bridge.isEmpty()) {
				bridge.offer(new Truck(truck[tidx++],time));
				continue;
			}
//			System.out.println("time : "+bridge.peek().time+"\t"+"weight : "+bridge.peek().weight);
//			System.out.println(time + "\t"+bridge);
			//!isEmpty일때,
			if (time - bridge.peek().time == w) bridge.poll();
			//tidx가 out of bound일때
			if (checkSum()) {//다리 위의 트럭들 무게의 합이 L보다 작을 때
				bridge.offer(new Truck(truck[tidx++],time));
			} else {// 다리 위의 트럭들 무게의 합이 L보다 클 때
				continue;
			}
			if (bridge.isEmpty()) break;
		}//end while
		System.out.println(time+w);
	}//end main
	
	public static boolean checkSum() {
		Iterator<Truck> it = bridge.iterator();
		int sum = 0;
		while (it.hasNext()) {
			Truck tmp = it.next();
			sum+=tmp.weight;
		}
		if (sum +truck[tidx]<= L) return true;
		return false;
	}//end checkSum
	
}//end class
