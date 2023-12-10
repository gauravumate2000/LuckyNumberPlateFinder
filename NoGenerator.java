package com.LuckyNoPlateFinder;


public class NoGenerator
{
	public int dobOperation(int no)
	{
		int no1=no;
		int tempAddition=0;
		int tempAddition2=0;

		int temp=0;
		while(no!=0)
		{
			temp=no%10;
	//		System.out.println("%10 : "+temp);
			tempAddition=tempAddition+temp;
	//		System.out.println("temp addition: " +tempAddition);
			no=no/10;
	//		System.out.println("/10: "+no);
		}
		int tempAdditionCopy=tempAddition;
		if(tempAddition>10)
		{
			while(tempAddition != 0)
			{
				temp=tempAddition%10;
				tempAddition2=tempAddition2+temp;
				tempAddition=tempAddition/10; 
			}
		}			
		else
		{
			return tempAddition;
		}
		
		return tempAddition2;
	}
}
