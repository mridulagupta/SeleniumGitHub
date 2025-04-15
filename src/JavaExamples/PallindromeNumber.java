package JavaExamples;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int original_num = num;
		int digit = 0;
		int reverse_num = 0;
		while(num!=0)
		{
			digit = num%10;
			reverse_num = reverse_num*10 + digit;
			num = num/10;
		}
		if(original_num==reverse_num)
		{
			System.out.println("Number is pallindrome");
		}
		else
		{
			System.out.println("Number is not pallindrome");
		}
		
		
		
		
		
		
	}

}
