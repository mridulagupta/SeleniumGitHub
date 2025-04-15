package JavaExamples;

public class Example16 {

	public static void main(String[] args) {
		
		int a[] = {3,6,9,12,15};
		int sum = 0;
		int avg = 0;
		int num = a.length;
		System.out.println(num);
		
		for(int i=0;i<a.length;i++)
		{
			int temp = a[i];//3,6,9.12,15
			sum = sum+temp;//0+3,3+6,3+6+9,,3+6+9+12,3+6+9+12+15
			avg = sum/num;
		}
		System.out.println("The sum of values in the array array is "+sum);
		System.out.println("The average of values in the array array is "+avg);
		
		
		

	}

}
