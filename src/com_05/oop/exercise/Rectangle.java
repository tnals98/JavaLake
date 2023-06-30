package com_05.oop.exercise;

import java.util.Scanner;

public class Rectangle {
//	너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	// =============================================> 필드
	public int width;
	public int height;
	
	// =============================================> 생성자
	public Rectangle() { 
			// 반환값이 없으면 void를 써준다 하지만 생성자는 반환값이 없어도 void 안써도 됨ㅇㅇ
			//클래스 이름과 동일해야함
			//객체를 초기화해줌
			//기본 생성자는 생략이 가능(매개변수 없을때)
		// 초기화
		width = 0;
		height = 0;
	}
	// =============================================> 메소드
	public int getArea() {
		return width*height;
	}
}
