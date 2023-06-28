package com_02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args)
	{
		//switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 입력해주세요.");
		System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노 중 선택해주세요.");
		String coffee = sc.next();
		
		switch (coffee) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼": 
			System.out.println("3500원");
			break;
		case "아메리카노": 
			System.out.println("2000원");
			break;
		default : 
			System.out.println("판매안함");
			break;
		}
	}
}
