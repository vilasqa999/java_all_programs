package JavaPrograms;


class TestException
{
	static void testAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("age is less than 18 access denied ");
		}
		else
		{
			System.out.println("age is greater than 18 access is given");
		}
	}
}



public class Testthrow {

	public static void main(String[] args) 
	{
		
		
		TestException.testAge(14);
		System.out.println("Error is managed.........");
		

	}

}
