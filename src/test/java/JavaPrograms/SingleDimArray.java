package JavaPrograms;

public class SingleDimArray {

	public static void main(String[] args) 
	{
		
		
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("size of array:"+a.length);
		
		System.out.println("Value of 4th element:"+a[3]);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Values in array:"+ a[i]);
		}
		
		
		// now how to use for each enhanncd for loop
		
		for(int i:a)
		{
			System.out.println("Enhanced for loop:"+ i);
		}

	}

}
