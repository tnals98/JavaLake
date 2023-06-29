package com_04.run.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args)
	{
		int kor = 0;
		int eng = 0;
		int math = 0;
		finish : 
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("====== 성적입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 : 
				System.out.println("====== 성적출력 ======");
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				System.out.printf("총점 : %d\n", kor+eng+math);
				System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);
				break;
			case 3 : System.out.println("프로그램이 종료되었습니다."); break finish;
			default : System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
			}
		}
	}
}
