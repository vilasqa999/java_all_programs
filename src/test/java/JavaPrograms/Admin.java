package JavaPrograms;



class Student
{

	int rollno=90;
	String name="Vilas";
	
	void display()
	{
		 System.out.println("Rollno:"+ rollno);
		 System.out.println("Student  name:"+ name);
		 
	}
}
public class Admin
{
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		Student ad=new Student();
		//((Student) ad).display();
		ad.display();
	}

}
