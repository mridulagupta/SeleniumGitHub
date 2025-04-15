package JavaExamples;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String original_str = str;
		String rev_str = "";
		int str_len = str.length();
		for(int i=str_len-1;i>=0;i--)
		{
			rev_str = rev_str+str.charAt(i);
		}
		if(original_str.equals(rev_str))
		{
			System.out.println("String is pallindrome");
		}
		
		else
		{
			System.out.println("String is not pallindrome");
		}
		
	}

}
