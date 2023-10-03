package JavaCollections;

import java.util.HashMap;

public class TestHashMap 
{

	public static void main(String[] args)
	{
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		
		System.out.println("Empty :"+ hm);
		
		hm.put(1, "Java");
		hm.put(2, "Java Collection");
		hm.put(3, "Selenium");
		hm.put(4, "Postman");
		hm.put(5, "Manual Testing");
		hm.put(6, "GIT");
		hm.put(7, "Jira");
		
		System.out.println("HashMap :"+ hm);
		
		System.out.println("Only keys :"+hm.keySet());
		
		System.out.println("Only values :"+hm.values());
		
		hm.replace(6, "projects");
		

		System.out.println("HashMap :"+ hm);
		
	}

}
