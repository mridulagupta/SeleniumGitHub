package JavaExamples;

public class MaxMinElementInArray {

	public static void main(String[] args) {
		
		int a[] = {63,10,9,5,8};
		int max= a[0]; 
		int min = a[0]; 
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max = a[i]; 
			}
			
			
		}
		System.out.println("Maximum element in array is "+max);
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) 
			{
				min = a[i]; 
			}
			
			
		}
		System.out.println("Minimum element in array is "+min);
		
		
	}

}
