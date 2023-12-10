package com.LuckyNoPlateFinder;

import java.util.Scanner;

public class Welcome {
	
	Scanner scannerObject = new Scanner(System.in);
	private int dayOfBirth=0;
	private int monthOfBirth=0;
	private int yearOfBirth=0;
	NoGenerator ng=new NoGenerator();
	
	public Welcome()
	{
		
	}
	public Welcome(int dayOfBirth, int monthOfBirth, int yearOfBirth)
	{
		this.dayOfBirth=dayOfBirth;
		this.monthOfBirth=monthOfBirth;
		this.yearOfBirth=yearOfBirth;
	}
	
	
	public void doWelcome()
	{
		System.out.println("Welcome to Lucky Number Plate finder.\n\n");
		
		System.out.println("Enter Day of birth: 1-31");
		this.dayOfBirth=scannerObject.nextInt();
		
		System.out.println("Enter Month of birth: 1-12");
		this.monthOfBirth=scannerObject.nextInt();
		
		System.out.println("Enter Year of birth: 1900-2025");
		this.yearOfBirth=scannerObject.nextInt();
		
		System.out.println("Thank you for the details...\n\n");
		
		
	}

	public int getDayOfBirth() {
		
		return ng.dobOperation(dayOfBirth);
	}
	public int getMonthOfBirth() {
		
		return ng.dobOperation(monthOfBirth);
	}

	public int getYearOfBirth() {

		return ng.dobOperation(yearOfBirth);
	}

	@Override
	public String toString() {
		return "Welcome [dayOfBirth=" + dayOfBirth + ", monthOfBirth=" + monthOfBirth + ", yearOfBirth=" + yearOfBirth
				+ "]";
	}
	
	
	
}