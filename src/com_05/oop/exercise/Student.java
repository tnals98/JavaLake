package com_05.oop.exercise;

import java.util.Scanner;

public class Student {
	String name;
	static int kor;
	static int eng;
	static int math;
	
	static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적입력 ======");
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
	}
	static void printScore() {
		int sum = Student.kor+Student.eng+Student.math;
		System.out.println("====== 성적출력 ======");
		System.out.printf("국어 : %d\n", Student.kor);
		System.out.printf("영어 : %d\n", Student.eng);
		System.out.printf("수학 : %d\n", Student.math);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", (double)(sum)/3);
	}
}
