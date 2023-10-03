package JavaPrograms;


class A
{
	int a;
	
	void display()
	{
		System.out.println("Value of a:"+ a);
	}
}


class B extends A
{
	
	int b;
	void show()
	{
		System.out.println("Value of b:"+ b);
	}
}





class C extends B
{
	
	int c;
	void printval()
	{
		System.out.println("Value of c:"+ c);
	}
}




public class Multilevel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		C c1=new C();
		c1.a=600;
		c1.b=1200;
		c1.c=2000;
		
		c1.display();
		c1.show();
		c1.printval();
		
		System.out.println("===============Success==============");

	}

}
