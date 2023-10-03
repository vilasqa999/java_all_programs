package JavaPrograms;

public class ContructorOverloading 
{

	ContructorOverloading(int x)
	{
		System.out.println("Print value of x:"+ x );
	}
	
	ContructorOverloading(double  x)
	{
		System.out.println("Print value of x:"+ x );
	}
	
	
	ContructorOverloading(int x, int y)
	{
		System.out.println("Print sum of x & y:"+ (x+y) );
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ContructorOverloading c1=new ContructorOverloading(10);
		ContructorOverloading c2=new ContructorOverloading(45.90);
		ContructorOverloading c3=new ContructorOverloading(46,4);
		
		

	}

}
