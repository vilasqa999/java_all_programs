package JavaPrograms;





public class Exception10 
{

	public static void main(String[] args) 
	{
	
		/*
		 * try { int x=100/0; } catch(ArithmeticException e) { System.out.println(e); }
		 * finally { System.out.println("========Hello Java============"); }
		 * 
		 */
	
	
	
	try
	{
		 int a[]=new int[5];
		 a[5]=90;
		 
	}
   catch(ArrayIndexOutOfBoundsException e)
	{
	   System.out.println(e);
	}
	 finally
	 {
		 System.out.println("========Hello Java============");
	 }
	
	
	
		
	}

}
