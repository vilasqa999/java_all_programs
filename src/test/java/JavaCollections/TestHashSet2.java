package JavaCollections;

import java.util.HashSet;

public class TestHashSet2 
{

	public static void main(String[] args)
	{
		
		
		HashSet hs1=new HashSet();
		hs1.add(2);
		hs1.add(4);
		hs1.add(6);
		hs1.add(7);
		hs1.add(8);
		
		
		HashSet hs2=new HashSet();
		hs2.add(1);
		hs2.add(3);
		hs2.add(5);
		hs2.add(7);
		hs2.add(8);
		

		
		hs2.addAll(hs1);
		
		//System.out.println("Combine operation:-"+ hs2);
		
		hs1.retainAll(hs2);
		
		System.out.println("same element operation:-"+ hs1);
		
		
		hs2.removeAll(hs1);
		
		System.out.println("Diff element operation:-"+ hs2);
	}

}
