package JavaExamples;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		
		//palindrome
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int digit = 0;
		int rev_num = 0;
		int new_num = num;
		while(new_num!=0)
		{
			
			digit = new_num%10;
			rev_num = rev_num*10 + digit;
			new_num = new_num/10;
		}
		
		if(rev_num==num)
			{
			   System.out.println("number is palindrome");
			}
		else
		{
			System.out.println("number is not palindrome");
		}
			
		
		
		

	}

}
