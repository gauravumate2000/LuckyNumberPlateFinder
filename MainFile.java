package com.LuckyNoPlateFinder;

import java.util.Scanner;

public class MainFile
{
	static Scanner scannerObject=new Scanner(System.in);
	private static int finalDayOfBirth;
	private static int finalMonthOfBirth;
	private static int finalYearOfBirth;
	
	public static void main(String abc[])
	{
		Welcome welcome=new Welcome();
		welcome.doWelcome();
		
		NoGenerator nogenerator=new NoGenerator();
		finalDayOfBirth=welcome.getDayOfBirth();
		finalMonthOfBirth=welcome.getMonthOfBirth();
		finalYearOfBirth=welcome.getYearOfBirth();
	
		System.out.println("finalDayOfBirth: "+finalDayOfBirth);
		System.out.println("finalMonthOfBirth: "+finalMonthOfBirth);
		System.out.println("finalYearOfBirth: "+finalYearOfBirth);
		
		
		
	}
}
