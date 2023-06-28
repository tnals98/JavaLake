package com_03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void While1() {
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
	}
	
	public void While2() {
		int i = 1;
	     int sum = 0;
	     while (i <= 100) {
	       if(i % 2 == 1){
	         sum += i;
	       }
	       i++;
	     }
	     System.out.print(sum);	     
	}

}
