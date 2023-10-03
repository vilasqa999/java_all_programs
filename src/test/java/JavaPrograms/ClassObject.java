package JavaPrograms;

public class ClassObject
{

      int rollno=90;
	  String name="Vilas";
	
	int display()
	{
		
		System.out.println("Student rollno:"+ rollno);
		System.out.println("Student name:"+ name);
		return rollno;
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
	
		ClassObject obj1=new ClassObject();
		obj1.display();
		

		//System.out.println("Student rollno:"+ rollno);
	//	System.out.println("Student name:"+ name);

	}

}
