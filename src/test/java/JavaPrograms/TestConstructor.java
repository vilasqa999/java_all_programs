package JavaPrograms;

public class TestConstructor
{
  int x,y;
	TestConstructor()
	{
		 x=20;
		 y=70;
	}
	
	
	
	
	public static void main(String[] args) 
	{

		
		TestConstructor test=new TestConstructor();
		System.out.println(test.x + " " + test.y);

	}

}
