package JavaExamples;

import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		//  Add two matrices using 2 dimensional array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int[] array1 = new int [size];
		int[] array2 = new int[size];
		
		System.out.println("enter the values in first array");
		for(int i=0;i<size;i++)
		{
			array1[i] = sc.nextInt();
		}
		

		System.out.println("enter the values in second array");
		for(int i=0;i<size;i++)
		{
			array2[i] = sc.nextInt();
		}
		
		Boolean isEqual = true;
		for(int i=0;i<size;i++)
		{
			if(array1[i] != array2[i])
				{
				
				isEqual = false;
				break;
			}
			
			
			
		}
		
		if(isEqual)
		{
			System.out.println("two arrays are equal");
		}
		else
		{
			System.out.println("two arrays are not equal");
		}
			

	}

}
