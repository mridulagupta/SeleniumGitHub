package JavaExamples;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); //3
		int tmp = 1;
		
		//for(int i=1;i<=num;i++)
		for(int i= num;i>=1;i--)	
		{
			tmp = tmp*i; //1*5=5
		
		}
		System.out.println("Factorial of a number" +num+ " "+ tmp);
		
		
		
		
		
	}

}
