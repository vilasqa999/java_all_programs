package JavaCollections;

import java.util.LinkedList;

public class TestLinkedlist 
{

	public static void main(String[] args) 
	{
	
		LinkedList<String> l1=new LinkedList<String>();
		
		
		l1.add("Maharashtra");
		l1.add("UP");
		l1.add("MP");
		l1.add("AP");
	    l1.add("ZP");
      //  System.out.println("Linked list:-"+ l1);
        

    	
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("JK");
		l2.addAll(l1);
	 //   System.out.println("New Linked list:-"+ l2);
	 //   System.out.println("Perticular element:-"+ l2.get(2));
		
		
     // to read data
	    
	    for(int i=0;i<l1.size();i++)
	    {
	    	System.out.println("===Read Linked using for loop ===");
	    	System.out.println(l1.get(i));
	    }
	    
	    
	    for (String s:l1)
	    {
	    	System.out.println("===Read Linked using for each loop ===");
	    	System.out.println(s);
	    	
	    }
}
}