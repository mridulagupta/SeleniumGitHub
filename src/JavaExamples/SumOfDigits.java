package JavaExamples;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); //1234
		int original_num = num;
		int sum = 0;
		while(num!=0)
		{
			sum = sum+num%10; //4, 7, 9, 10
			num = num/10; //123, 12, 1, 0
		}
		System.out.println("Sum of digits in a number"+" "+original_num+" "+"is"+" "+sum);
		
		

	}

}
