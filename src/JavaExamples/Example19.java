package JavaExamples;

public class Example19 {

	public static void main(String[] args) {
		
		int a[] = {10,5,12,15,38};
		int greater_num = a[0];
		int shortest_num = a[0];
		
		for(int number:a)
		{
			if(number>greater_num)
			{
				greater_num = number;
			}
		
		}
		System.out.println("greatest number in the array is "+greater_num);
		
		for(int number:a)
		{
			if(number<shortest_num)
			{
				shortest_num = number;
			}
		
		}
		System.out.println("shortest number in the array is "+shortest_num);
		

	}

}
