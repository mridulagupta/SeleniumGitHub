package JavaExamples;

public class Example18 {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,5,6};
		int num = a.length+1;
		int expectedsum = (num*(num+1))/2;
		int actualsum = 0;
		System.out.println(expectedsum);
		for(int number:a)
		{
			actualsum = number+actualsum;
		}
		System.out.println(actualsum);
		int missing_num = expectedsum-actualsum;
		System.out.println("missing number is "+missing_num);
		
		
	}

}
