package JavaExamples;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[] = {2,6,4,8,1,4};
		int array_len = a.length;
		int sum = 0;
		
		/*for(int i=0;i<array_len;i++)
		{
			sum = sum+a[i]; //0+2=2, 2+6=8, 8+4=12, 12+8=20, 20+1=21
		}
		*/
		for(int value:a)
		{
			sum = sum+value;
		}
		
		System.out.println("Sum of elements in array is "+sum);
		
		
		
		
		
	}

}
