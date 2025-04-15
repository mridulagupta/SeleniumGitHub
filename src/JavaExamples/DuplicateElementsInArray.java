package JavaExamples;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {1,6,3,8,3};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate value in array is "+a[i]);
					flag=true;
				}
			}
			
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate elements not found in the array");
		}
		
		
		
		
	}

}
