package JavaExamples;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Welcome to java and Selenium";
		String[] words = str.split("\\s");
		String revers_string = "";
		
		//Approach1
		/*for(String w:words)
		{
			String reverse_word= "";
			for(int i=w.length()-1;i>=0;i--)A
			{
				reverse_word = reverse_word+w.charAt(i);
			}
			revers_string = revers_string+reverse_word+" ";
		}
		System.out.println(revers_string);
		*/
		
		//Approach2
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			revers_string= revers_string+sb.toString()+" ";
			
		}
		
		System.out.println(revers_string);
		
		
	}

}
