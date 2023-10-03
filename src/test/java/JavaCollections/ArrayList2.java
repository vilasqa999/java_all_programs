package JavaCollections;

import java.util.ArrayList;

public class ArrayList2 
{

	public static void main(String[] args)
	{
		
		
		ArrayList<String> al=new ArrayList<String>();
		
		
		al.add("A");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("A");
		
		
		System.out.println("ArrayList:-"+ al);
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.addAll(al);
		
		System.out.println("After ArrayList:-"+ al);
		
		System.out.println("==========New Arraylist============");
		

		System.out.println("ArrayList 2:-"+ al2);
		
		for(String s:al)
		{
			System.out.println("array list:-"+ al);
			
			
		}
		
		

	}

}
