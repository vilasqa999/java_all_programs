package JavaPrograms;


class Parent
{
	int parvar=60;
	void displayparent()
	{
		System.out.println("Parent Class:"+ parvar);
	}
}



class Child1 extends Parent
{
	int child1age;
	void displaychild1()
	{
		System.out.println("Child 1 Class:"+ child1age);	
	}
	
}



class Child2 extends Parent
{
	int child2age;
	void displaychild2()
	{
		System.out.println("Child 1 Class:"+ child2age);	
	}
	
}
public class Hirchical
{

	public static void main(String[] args) 
	{
	
		System.out.println("=============Child 2===================");
		Child2 c2=new Child2();
		c2.child2age=30;
		c2.displaychild2();
		
		
		System.out.println("=============Child 1===================");
		Child1 c1=new Child1();
		c1.child1age=35;
		c1.displaychild1();
		
		
		
	}

}
