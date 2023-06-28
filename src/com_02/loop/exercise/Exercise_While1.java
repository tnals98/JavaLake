package com_02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String [] args)
	{
		// While문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면
		// 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 14 입니다.
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		while(true) {
			System.out.println("정수 하나 입력 : ");
			i = sc.nextInt();
			
			if(i != -1) {
				sum += i;
			}else if(i == -1){
			     break;
			}	
		} 	
		System.out.print("입력하신 수의 합은 " + sum + "입니다.");
		
	
		// 다른 방법
//		System.out.println("정수 하나 입력 : ");
//		input = sc.nextInt();
//		while(input != -1) {
//			sum += input;
//			System.out.println("정수 하나 입력 : ");
//			input = sc.nextInt();
//		}System.out.print("입력하신 수의 합은 " + sum + "입니다.");
//		
	}
}
