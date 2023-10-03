package JavaPrograms;

public class TestStaticVariable 
{

	int rollno;
	String studname;
	static String college="Pune Univeristy";
	
	
	
	public static void main(String[] args)
	{
	
		
		TestStaticVariable test=new TestStaticVariable();
		
		test.rollno=200;
		test.studname="Amar";
		
		System.out.println(test.rollno+ test.studname+ test.college);

		TestStaticVariable test1=new TestStaticVariable();
		
		test1.rollno=200;
		test1.studname="Amar";
		
		System.out.println(test1.rollno+ test1.studname+ test1.college);

	}

}
