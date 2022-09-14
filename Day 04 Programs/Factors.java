public class Factors 
{
	public static void main(String[] args) 
	{
		int getNumber = 100;
		int getCount = 0;
		System.out.print("Factors of " + getNumber + " are: ");
		for (int i = 1; i <= getNumber; ++i) 
		{
			if (getNumber % i == 0) 
			{
         				getCount ++;
        				System.out.print(i + " ");
      			}
		}
        		System.out.println(" \nTotal number of Factors is "+getCount);
  	}
}