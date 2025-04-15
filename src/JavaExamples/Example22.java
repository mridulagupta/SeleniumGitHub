package JavaExamples;

import java.util.Scanner;

public class Example22 {

	public static void main(String[] args) {
		// Write a Java program to search specific element in an array.
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the size of an array");
		  int size = sc.nextInt();
		  int[] array1 = new int[size];
		  System.out.println("enter values in array");
		  for(int i=0;i<size;i++)
		  {
			  array1[i] = sc.nextInt();//{1 3 4 5 6}
		  }
		  
		  System.out.println("enter the required number");
		  int temp = sc.nextInt();
		  boolean found = false;
		  for(int number:array1)
		  {
			  if(number==temp)
			  {
				  System.out.println("number is found");
				  found = true;
				  break;
			  }
			  
			  
		  }
		  if(!found)
		  {
			  System.out.println("number is not found");
			  
		  }
		  
		  
		
		  
		
		
		
		
		
	}

}
