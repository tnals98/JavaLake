package com_07.opp.polymorphism.exercise;

class SuperClass {
	void paint() {   //3번째 실행
		draw();   //4번째 실행 // 이 draw는 8줄로 갈지 19줄로 갈지 정해지지 않은 상태!
	}

	void draw() {   //7번째 실행
		System.out.println("Super Object");   //8번째 실행
	}
}

class SubClass extends SuperClass {
	void paint() {   //1번째 실행
		super.paint();   //2번째 실행
		super.draw();   //6번째 실행
	}

	void draw() {
		System.out.println("Sub Object");   //5번째 실행
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}
