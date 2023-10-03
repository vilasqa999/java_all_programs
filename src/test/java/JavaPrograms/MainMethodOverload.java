package JavaPrograms;

public class MainMethodOverload
{
	
	void main(int x)
	{
		System.out.println("Print value of x:"+ x);
	}
 
	void main(double x)
	{
		System.out.println("Print value of x in double:"+ x);
	}
	
	void main(int x, int y)
	{
		System.out.println("Print sum of x & y:"+ (x+y));
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		MainMethodOverload m1=new MainMethodOverload();
		m1.main(20);
		m1.main(54.90);
		m1.main(30,50);
	}

}
