package JavaExamples;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("enter temperature in fahrenheit");
		Scanner sc = new Scanner(System.in);
		double fahrenheit =  sc.nextDouble();
		double celsius = ((5*(fahrenheit-32))/9.0); 
		System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius+"in celsius");
		
	}

}
