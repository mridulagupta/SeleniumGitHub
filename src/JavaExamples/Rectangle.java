package JavaExamples;

public class Rectangle {
	
	int length, width;
	Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	Rectangle(int len1, int wid1)
	{
		length = len1;
		width = wid1;
	}
	
	int calculateArea()
	{
		int area = length * width;
		return area;
	}
	
    
	public static void main(String [] args)
	{
		
		Rectangle rect = new Rectangle();
		Rectangle rect1 = new Rectangle(10,20);
		
		
		System.out.println("Area of rectangle with default constructor is: "+rect.calculateArea());
		System.out.println("Area of rectangle with parameterized constructor is: "+rect1.calculateArea());
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
