package JavaExamples;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int temp = 0;
		int a = sc.nextInt(); //4
		int b = sc.nextInt(); //8
		int c = sc.nextInt(); //2
		
		/*if((a>b) && (a>c))
		{
			temp = a;
		}
		else if((b>a) && (b>c))
		{
			temp = b;
		}
		else
		{
			temp = c;
		}
		
		System.out.println("Largest of three number is "+temp);
	*/
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest of three number is "+largest);
	}

}
