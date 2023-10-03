package JavaCollections;

import java.util.HashSet;

public class TestHashSet
{

	public static void main(String[] args) 
	{
		
		
		HashSet hs=new HashSet();
		
		hs.add("Vilas");
		hs.add(13123);
		hs.add(34.90);
		hs.add("Giri");
		hs.add("Giri");
		hs.add("May");
		
		System.out.println("Hashset:-"+ hs);
		System.out.println("Size of Hashset:-"+ hs.size());
		
		hs.remove("Giri");

		System.out.println("After remove Hashset:-"+ hs);
		
		System.out.println("After remove Hashset:-"+hs.contains("vilas"));
	}

}
