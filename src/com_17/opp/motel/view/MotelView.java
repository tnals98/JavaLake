package com_17.opp.motel.view;

import java.util.Scanner;

public class MotelView {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.printf("1.입실\t 2.퇴실\t 3.방보기\t 4.종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;

	}
	
	public int inputRoomNumber(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번방에 "+category+"하시겠습니까?");
		int roomNo = sc.nextInt();
		return roomNo;
	}
}
