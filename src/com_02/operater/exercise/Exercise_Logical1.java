package com_02.operater.exercise;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args)  throws Exception
	{
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result;
		result = (1 < num) && (num < 100);
		System.out.println("result의 결과값 : "+ result);		
	}
}
