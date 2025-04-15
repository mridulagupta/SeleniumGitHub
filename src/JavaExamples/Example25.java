package JavaExamples;

import java.util.Scanner;

public class Example25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int original_num = num;
		int sum = 0;
		int n = String.valueOf(num).length();
		while(num>0)
		{
			int digit = num%10;
			sum = sum + (int)Math.pow(digit, n);
			num = num/10;
			
		}
		if(sum == original_num)
		{
			System.out.println("number is armstromg number");
		}
		else
		{
			System.out.println("number is not armstromg number");
		}
		
		
		
		
		

	}

}
