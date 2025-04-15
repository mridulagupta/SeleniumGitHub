package JavaExamples;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		
		//Write a Java to display the multiplication table of a given integer using for loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Multiplication table of numner "+ num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + "* " + i + "= "+ num*i);
		}
		
	   
	}

}
