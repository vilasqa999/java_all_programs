package JavaPrograms;

public class TestparaConstuctor 
{

	int id;
	String name;
	double sal;
	
	
	TestparaConstuctor(int objid, String empname, double s)
	{
		id=objid;
		name=empname;
		sal=s;
		
	}
	
	public static void main(String[] args)
	{
	
		TestparaConstuctor test1=new TestparaConstuctor(55555,"Amar",500000);
		System.out.println("===============================================");
		
		System.out.println(test1.id + " " + test1.name + " " + test1.sal);
		
		System.out.println("===============================================");
	}

}
