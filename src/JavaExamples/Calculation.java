package JavaExamples;

public class Calculation {
	
	int i1, i2, i3;
	
	Calculation(int num1, int num2, int num3)
	{
		i1 = num1;
		i2 = num2;
		i3 = num3;
	}
	
	void sum()
	{
		int total = i1+i2+i3;
		System.out.println("total sum is "+total);
	}
			
	public static void main(String [] args)
	{
		Calculation cal = new Calculation(10, 20, 30);
		cal.sum();
	}
	
	
	

}
