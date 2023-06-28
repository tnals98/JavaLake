package com_02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{	
		for (int i = 1; i < 10; i++) {
			for (int h = 2; h < 10; h++) {
				System.out.print(h +" * "+ i + " = " + h*i + "\t");
			}
			System.out.println();
		}
	}
}
