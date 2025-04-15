package JavaExamples;

import java.util.Scanner;

public class CountDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(); //1234
		int original_num = num;
		int count = 0;
		
		while(num>0)
		{
			num = num/10; //123, 12, 1, 0
			count++; //1, 2, 3, 4
		}
		
		System.out.println("The number"+" "+original_num+" "+"has"+" "+count+" "+"digits" );
		
		
		
	}

}
