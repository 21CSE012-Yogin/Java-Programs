import java.util.Scanner;  
public class PerfectNumber  
{  
	public static void main(String args[])    
   	{  
        		long getNumber;
        		long sum = 0;
        		int i = 1; 
        		Scanner reader = new Scanner(System.in);         
        		System.out.print("Enter the number : ");  
        		getNumber = reader.nextLong();  
        		while( i <= getNumber/2 )  
        		{  
            			if( getNumber%i == 0 )  
            			{   
                				sum = sum + i;  
            			}  
            			i++;  
        		} 
        		if( sum == getNumber )  
        		{    
            			System.out.println( getNumber + " is a perfect number." );  
        		} 
        		else   
            			System.out.println( getNumber + " is not a perfect number." );   
    	}  
}