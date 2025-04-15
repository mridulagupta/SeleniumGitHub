package JavaExamples;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		//Write a Java program to get a number from the user and print whether it is positive or negative
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		if(num1<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is posistive");
		}
		
		
		
		
	}

}
