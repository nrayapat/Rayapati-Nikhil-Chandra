package com.capagemini.day2;

public class Interest {

	public static double simpleInterest(double principle,double time,double rateofInterest) {
		// TODO Auto-generated method stub
		double simpleInterest;
		return simpleInterest = (principle*time*rateofInterest)/100;
	}
	public static double compoundInterest(double principle,double time,double rateofInterest) 
	{
double compoundInterest;
return compoundInterest=principle*Math.pow(1.0+rateofInterest/100.0,time)-principle;
}
}