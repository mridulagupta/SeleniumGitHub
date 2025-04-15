package JavaExamples;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		//Write a Java program that takes a year from user and print whether that year is a leap year or 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		if(year%400==0)
	    {
			System.out.println(year +" year is leap year");
		}
		else if (year%100==0)
		{
			System.out.println(year +" year is not a leap year");
		}
			
		
		else if(year % 4==0)
		{
			System.out.println(year +" year is not leap year");
		}
		else
		{
			System.out.println("its not a leap year");
		}
		
		
		

	}

}
