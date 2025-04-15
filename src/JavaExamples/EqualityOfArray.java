package JavaExamples;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,3,6,8,9};
		int b[] = {1,3,6,8,20};
		
		boolean status = true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		
		if(status==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}
		
		/*boolean status = Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}
		*/
	}

}
