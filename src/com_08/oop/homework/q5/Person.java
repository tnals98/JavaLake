package com_08.oop.homework.q5;

public class Person {
	// 이름
	String name;
	// 돈
	int money;
	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	// 커피도 사묵네?
	public void buyCoffee(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나와야함
//		this.money = this.money - money;
		this.money -= money;
		cafe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}