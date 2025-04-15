package JavaExamples;

public class Example9 {

	public static void main(String[] args) {
		//Write a Java program to find greatest of 3 numbers.
		
		int a[] = {3,78,98};
		int num = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>num)
			{
				num = a[i];
			}
		}
		System.out.println("the greatest number among three is "+num);
		
	}

}
