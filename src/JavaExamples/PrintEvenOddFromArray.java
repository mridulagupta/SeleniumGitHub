package JavaExamples;

public class PrintEvenOddFromArray {

	public static void main(String[] args) {
		
		int a[] = {2,6,4,8,1,4};
		int array_len = a.length;

		System.out.println("Even numbers in array are--------");
		//for(int i=0;i<array_len;i++)
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
			
		}
		
		System.out.println("Odd numbers in array are-------------");
		for(int i=0;i<array_len;i++)
			
			{
			    if(a[i]%2!=0)
			    {
			    	System.out.println(a[i]);
			    }
			
			}
		}
		

	}


