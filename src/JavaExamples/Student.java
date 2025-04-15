package JavaExamples;

public class Student {
	
	int SID;
	String Sname;
	int sub1, sub2, sub3;
	
	public void getStuData(int id, String name)
	{
		SID = id;
		Sname = name;
			
	}
	
	public void getStuMarks(int sm1, int sm2, int sm3)
	{
		sub1 = sm1;
		sub2 = sm2;
		sub3 = sm3;
	}
	 
	
	public void totalMarks()
	{
		
		int total_marks = sub1 + sub2 + sub3;
		System.out.println("Student ID: "+ SID+"\nStudent name: "+ Sname+ "\ntotal marks are: "+total_marks);
		
	}
	
	
	public static void main(String [] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.getStuData(101, "Suresh");
		s1.getStuMarks(25, 30, 38);
		s1.totalMarks();
		
		System.out.println("\n******************************************");
		
		s2.getStuData(102, "Mahesh");
		s2.getStuMarks(35, 40, 48);
		s2.totalMarks();
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
}
