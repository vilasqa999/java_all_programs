package JavaPrograms;

public class MethodOverload 
{

	void addmethod(int a, int b)
	{
		System.out.println("First method:"+ (a+b));
		
	
	}
	

	void addmethod(double a, double b)
	{
		System.out.println("second method:"+ (a+b));
		
	
	}
	

	void addmethod(int a, double b)
	{
		System.out.println("Third method:"+ (a+b));
		
	
	}
	

	void addmethod(int a, int b, int c)
	{
		System.out.println("Fourth method:"+ (a+b+c));
		
	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		MethodOverload m1=new MethodOverload();
		m1.addmethod(30,20);
		m1.addmethod(43.56, 57.45);
		m1.addmethod(34,76.90);
		m1.addmethod(30,60 , 120);
	}

}
