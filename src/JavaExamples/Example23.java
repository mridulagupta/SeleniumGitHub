package JavaExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {
		//Write a program to sort an array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		  int size = sc.nextInt();
		  int[] array1 = new int[size];
		  System.out.println("enter values in array");
		  for(int i=0;i<size;i++)
		  {
			  array1[i] = sc.nextInt();
		  }
		  
		  Arrays.sort(array1);
		  
		  for(int i=0;i<size;i++)
		  {
			  System.out.print(array1[i] + " ");
		  }

	}

}
