package com.capagemini.day2;

public class Armstrong {

	public static boolean checkArmstrongNumber(int num)
	
	{
		int digit;
		int number=num;
		int sum=0;
		while(num!=0)
		{
			digit = num %10;
			sum =  sum + digit*digit*digit;
			num = num/10;
			
		}
		if(sum==number) {
			return true;
		}else {
			return false;
		// TODO Auto-generated method stub
		
	}
	}
}
