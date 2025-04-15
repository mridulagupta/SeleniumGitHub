package JavaExamples;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int fact_num = 1;
		
		while(num!=0)
		{
			//!5 = 5*(5-1)*(5-2)*(5-3)*(5-4)
			fact_num = fact_num*num;
			num = num-1;
		}
		System.out.println("factorial of a number is "+ fact_num);
		
		

	}

}
