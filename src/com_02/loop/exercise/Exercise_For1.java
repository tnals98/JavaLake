package com_02.loop.exercise;

public class Exercise_For1 {
	public static void main(String [] args)
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
	     
//	     int sum = 0;
//	     for(int i = 1; i <= 10; i++) {
//	    	 sum += i; //sum = sum + i
//	    	 
//	    	 if(i <= 9) {
//	    		 System.out.print(i + "+");
//	    	 }else { 
//	    		 System.out.print(i + "=");
//	    	 } 
//	     }
//	     System.out.print(sum);
	}
}
