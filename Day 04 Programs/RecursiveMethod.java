import java.io.*;
public class RecursiveMethod
{
	static int factorial( int getNumber )
	{
		if( getNumber == 0 )
		{
			return 1;
		}
		return getNumber*factorial( getNumber-1 );
	}
	public static void main( String args[] ) 
	{
		System.out.println( "Factorial of the number 5 is: "+factorial(5) );
	}
}