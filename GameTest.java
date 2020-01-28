package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		int comp = 0;
		int usr = 0;
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.println("번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
			case 1:
				for (int i =0;i<5;i++) {
					System.out.println("가위바위보 중 하나 입력:");
					Scanner sc2 = new Scanner(System.in);
					String rsp = sc2.next();
					int com_rsp = (int)(Math.random()*3)+1;
					if (rsp == "가위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else if (rsp == "바위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else {//보
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					}
					if (comp == 3 && usr < 3) {
						System.out.println("###컴퓨터 승!!!");
						break;
					} else if (usr == 3 && comp < 3) {
						System.out.println("###사용자 승!!!");
						break;
					} else if (usr == 3 && comp == 3) {
						System.out.println("###무승부!!!");
						break;
					}
				}
				break;
			case 2:
				for (int i =0;i<3;i++) {
					System.out.println("가위바위보 중 하나 입력:");
					Scanner sc2 = new Scanner(System.in);
					String rsp = sc2.next();
					int com_rsp = (int)(Math.random()*3)+1;
					if (rsp == "가위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else if (rsp == "바위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else {//보
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					}
					if (comp == 2 && usr < 2) {
						System.out.println("###컴퓨터 승!!!");
						break;
					} else if (usr == 2 && comp < 2) {
						System.out.println("###사용자 승!!!");
						break;
					}  else if (usr == 2 && comp == 2) {
						System.out.println("###무승부!!!");
						break;
					}
				}
				break;
			case 3:
				for (int i =0;i<1;i++) {
					System.out.println("가위바위보 중 하나 입력:");
					Scanner sc2 = new Scanner(System.in);
					String rsp = sc2.next();
					int com_rsp = (int)(Math.random()*3)+1;
					if (rsp == "가위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else if (rsp == "바위") {
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					} else {//보
						if (com_rsp == 1) {//가위
							System.out.println("비겼습니다!!!");
							comp+=1;
							usr+=1;
						} else if (com_rsp == 2) {//바위
							System.out.println("졌습니다!!!");
							comp+=1;
						} else {//보
							System.out.println("이겼습니다!!!");
							usr+=1;
						}
					}
					if (comp == 1 && usr < 1) {
						System.out.println("###컴퓨터 승!!!");
						break;
					} else if (usr == 1 && comp < 1) {
						System.out.println("###사용자 승!!!");
						break;
					}  else if (usr == 1 && comp == 1) {
						System.out.println("###무승부!!!");
						break;
					}
				}
				break;
		}
	}
}


