package JavaExamples;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); //1234
		int digit = 0;
		int even = 0;
		int odd = 0;
		while(num!=0)
		{
			digit = num%10; //4, 3, 2, 1
			if(digit%2==0)
			{
				even++; //1, 2
			}
			else
			{
				odd++; //1, 2
			}
			num = num/10; //123, 12, 1, 0
		}
		System.out.println("Even Number are" +" "+even+" "+ "and Odd number are"+" "+odd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
