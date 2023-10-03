package JavaPrograms;

class Bank
{
	 double rateOfInterest()
	{
	 return 5.0;	
	}
	 
}


class ICICI extends Bank
{
	double rateOfInterest()
	{
		return 5.5;
	}
}





class SBI extends Bank
{
	double rateOfInterest()
	{
		return 5.4;
	}
}



class HDFC extends Bank
{
	double rateOfInterest()
	{
		return 6.0;
	}
}


public class MethodOveride 
{

	public static void main(String[] args) 
	{
	
		
	System.out.println("===============SBI interest rate=============");	
	SBI s=new SBI();
	System.out.println(s.rateOfInterest());
		
	
	System.out.println("===============ICICI interest rate=============");	
	ICICI i1=new ICICI();
	System.out.println(i1.rateOfInterest());
		
	
	System.out.println("===============HDFC interest rate=============");	
	HDFC h=new HDFC();
	System.out.println(h.rateOfInterest());
		
	
	System.out.println("===============Thank You =============");	
	}

}
