package JavaCollections;
import java.util.ArrayList;
public class ArrayList1 
{

	public static void main(String[] args) 
	{
	
		ArrayList al=new ArrayList();
		
       al.add("Vilas");
       al.add("Giri");
       al.add(300);
       al.add("jodwadi");
       
       System.out.println(al);
 
       
       
       System.out.println(al.size());
       
       al.remove(2);
       System.out.println(al.size());
       

       System.out.println(al);
       
       al.clear();

       System.out.println(al);
 
 
	}

}
