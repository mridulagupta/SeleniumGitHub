package JavaExamples;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1= sc.next();
		System.out.println("enter the second string");
		String s2 = sc.next();
		if(s1.compareTo(s2)==0)
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		
	}
		

	}


