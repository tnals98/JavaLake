package com_03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void Exercise_For1()
	{
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
				// 1+2+3+4+5+6+7+8+9+10=55
				
			     int i = 1;
			     int sum = 0;
			     while (i <= 10) {
			       sum += i;
			       if(i < 10){
			         System.out.print(i + "+");
			       }else{
			         System.out.print(i + "=");
			       }
			       i++;
			     }
			     System.out.print(sum);
			     
//			     int sum = 0;
//			     for(int i = 1; i <= 10; i++) {
//			    	 sum += i; //sum = sum + i
//			    	 
//			    	 if(i <= 9) {
//			    		 System.out.print(i + "+");
//			    	 }else { 
//			    		 System.out.print(i + "=");
//			    	 } 
//			     }
//			     System.out.print(sum);
	}
	
	public void Exercise_For2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
				// 그 수의 구구단을 출력하세요.
				// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
				Scanner sc = new Scanner(System.in);
				System.out.println("정수 하나 입력 : ");
				int dan = sc.nextInt();
				
				System.out.println(dan + "단");
				for(int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + dan*i);
				}
	}
	public void ForDouble1() {
		for (int i = 1; i < 10; i++) {
			for (int h = 2; h < 10; h++) {
				System.out.print(h +" * "+ i + " = " + h*i + "\t");
			}
			System.out.println();
		}
	}
	
	public void ForDouble2() {
		//0시 0분부터 23시 59분까지 출력하기!
				for (int h = 0; h < 24; h++) {
					for (int i = 0; i < 60; i++) {
						System.out.printf("%2d시 %2d분\n",h, i);
						// \n->개행
					}
				}
	}
	
	public void ForDouble3() {
		for (int h = 0; h <= 10; h++) {
			for (int i = 0; i<h ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
