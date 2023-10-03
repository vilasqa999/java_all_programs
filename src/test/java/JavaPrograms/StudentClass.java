package JavaPrograms;



public class StudentClass 
{
	
	
	
	int rollno;
	String name;
	

	 void insertdata(int roll, String studname)
	 {
		 rollno=roll;
		 name=studname;
		 
	 }
	 
	 void displaydata()
	 {
		 System.out.println("Student rollno:"+ rollno);
		 System.out.println("Student name:"+ name);
		 
	 }
	

}
