package JavaPrograms;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		
		
		int arr[][]=new int[3][3];
		
		arr[0][0]=2;
		arr[0][1]=4;
		arr[0][2]=2;
		arr[1][0]=2;
		arr[1][1]=2;
		arr[1][2]=2;
		arr[2][0]=2;
		arr[2] [1]=2;
		arr[2][2]=2;
		

		
		System.out.println("Two dim array:"+ arr.length);
		System.out.println("No of col:"+ arr[0].length);
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			
				System.out.println("Two dimensional array:"+ arr[i][j]);
				
			}
		}
	}

}
