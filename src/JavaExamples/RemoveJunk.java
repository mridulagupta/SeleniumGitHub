package JavaExamples;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@%^**Test------%^*&^*&Java----#%^$-----Selenium";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String str = "java      Selenium     Testing";
		System.out.println("before removing spcaes"+str);
		str = str.replaceAll("\\s", "");
		System.out.println("after removing spcaes"+" "+str);
		
		
	}

}
