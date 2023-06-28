package com_02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		//0시 0분부터 23시 59분까지 출력하기!
		for (int h = 0; h < 24; h++) {
			for (int i = 0; i < 60; i++) {
				System.out.printf("%2d시 %2d분\n",h, i);
				// \n->개행
			}
		}
	}
}
