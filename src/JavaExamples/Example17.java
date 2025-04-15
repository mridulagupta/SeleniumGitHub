package JavaExamples;

public class Example17 {

	public static void main(String[] args) {
		
		int a[] = {2,5,6,9,10,15};
		System.out.println("Even numbers in the array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+ " ");
				
			}
			
		}
		System.out.println("\nodd numbers in the array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+ " ");
				
			}
			
		}
	}
}
	
		
		
	
		    