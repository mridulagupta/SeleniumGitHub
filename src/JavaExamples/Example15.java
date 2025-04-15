package JavaExamples;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		
		int first_term = 0, second_term = 1;
		int num = 0;
		for(int k=1; k<=10;k++)
		{
			System.out.println(first_term); //0
		    num = first_term + second_term; //0+1 = 1, 1+1=2, 1+2=3
		    first_term=second_term; //1, 1,2,
		    second_term=num; //1,2,3
				
				
			//0,1,1.2
			
			
		}
		
		
	}

}
