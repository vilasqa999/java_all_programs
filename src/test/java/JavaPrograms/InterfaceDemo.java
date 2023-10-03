package JavaPrograms;





interface TestDemo
{
	void showdata();
}


class TestClass10  implements TestDemo
{

	public void showdata()
	{
	  System.out.println("Abtract method");
		// TODO Auto-generated method stub
		
	}
	
}



public class InterfaceDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		TestClass10 t1=new TestClass10();
		t1.showdata();
		
		System.out.println("============Thank u===============");

	}

}
