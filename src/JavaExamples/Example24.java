package JavaExamples;

import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {
		// Write a java program to compare two strings, ignoring case differences.
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter strings");
		//String s1 = sc.nextLine();
		//String s2 = sc.nextLine();
		
		//System.out.println(s1.toUpperCase());
		//System.out.println(s1.toLowerCase());
		
		/*if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		*/
		
		//Write a Java program to concatenate a given string to the end of another string. 
		
		/*String result = s1.concat(" ").concat(s2);
		System.out.println(result);
		*/
		
		
		//Write a java program to get the length of a given string
		//System.out.println("the length of the string s1 is "+s1.length());
		
		
		//Write a Java program to get a substring of a given string between two specified positions
		
		//System.out.println(s1.subSequence(2, 5));
		
		// Write a Java program to reverse a string.
		/*String rev = " ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev+s1.charAt(i);
			
		}
		System.out.println("the reverse string is "+rev);
		*/
		
		
		// Write a Java program to count number of time a character repeated in a string.
		
		/*System.out.println("enter the string which you want to count");
		char countstring = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==countstring)
				count++;
		}
		System.out.println("the occurence of a required character is "+count);
		*/
		
		
		//Write a Java program  to Swap the 2 strings.
		
		/*String temp = "";
		temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("first string was welcome not it is changed to "+s1);
		System.out.println("second string was to java not it is changed to "+s2);
		*/
		
		//Write a program to check a string is palindrome or not
		
		String str = sc.next();
		String rev_str = "";
		for(int i=str.length()-1;i>=0;i--)//madam
		{
			rev_str = rev_str+str.charAt(i);
		}
		if(str.equals(rev_str))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
