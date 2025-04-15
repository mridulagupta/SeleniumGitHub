package JavaExamples;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		String str = "Kabeer Vidit Mridula Dheerendra";
		int total_length = str.length();
		System.out.println("Total string length is "+total_length);
		
		int total_length_removeChar = str.replace("E","").length();
		System.out.println("Total string length is "+total_length_removeChar);
		
		int count = total_length-total_length_removeChar;
		System.out.println("Occurrence of a character E is "+count);
		
		
	}

}
