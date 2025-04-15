package JavaExamples;

import java.util.Scanner;

public class Example21 {

	public static void main(String[] args) {
		// Add two matrices using 2 dimensional array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows and cols");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		//declaration of arrays
		int [][] array1 = new int[rows][cols];
		int [][] array2 = new int[rows][cols];
		int [][] sumarrays = new int[rows][cols];
		
		//enter first array values
		System.out.println("enter first array values");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array1[i][j] = sc.nextInt();
			}
		}
		
		//enter second array values
		System.out.println("enter second array values");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array2[i][j] = sc.nextInt();
			}
		
		
		}
		
		//sum of two arrays
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				sumarrays[i][j] = array1[i][j]+ array2[i][j];
			}
		
		
		}
		
		//print two arrays
		System.out.println("sum of two array values are:");
		
		for(int i=0;i<rows;i++)
				{
					for(int j=0;j<cols;j++)
					{
						System.out.print(sumarrays[i][j]+" ");
					}
					
				System.out.println();
				
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
