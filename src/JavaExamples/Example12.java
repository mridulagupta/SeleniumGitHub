package JavaExamples;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		
		//Write a Java program count the number of digits of the number using while loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		int reverse_number = 0;
	    //12345
		while(num!=0)
		{
	       //num = num/10   ; 
		  //count++;
			
			count= num%10;
			reverse_number = reverse_number*10+count;
			num = num/10;
			
		}
		//System.out.println("number of digits in the number are "+count);
		System.out.println("Reverse number is "+reverse_number);
		
	}

}
