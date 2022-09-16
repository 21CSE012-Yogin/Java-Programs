import java.util.Scanner;
import java.math.*;
public class PerfectSquare 
{
    public static void main( String args[ ] ) 
    {
        try
        {
            Scanner reader = new Scanner( System.in );
            System.out.println( "Enter an number : " );
            int getNumber = reader.nextInt( );
            double b = Math.sqrt( getNumber );
            System.out.print( "The answer is "+b+", ");
            System.out.println( -b );
        }
        catch( Exception e )
        {
            System.out.println( "Invalid!" );
        }
    }
}