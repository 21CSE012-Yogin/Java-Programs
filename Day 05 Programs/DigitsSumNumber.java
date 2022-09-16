import java.util.Scanner;
public class DigitsSumNumber
{
    public static void main( String args[ ] )
    {
        System.out.println( "Enter the value : " );
        Scanner reader = new Scanner( System.in );
        int getNumber = reader.nextInt( );
        System.out.println( "Enter " +getNumber+ " digit number" );
        int getNumber1 = reader.nextInt( );
        int m = getNumber;
        int remainder;
        int x = 0;
        while( m > 0 )
        {
            remainder = m % 10;
            x = x + remainder;
            m = m / 10;
        };
        if( x < 10 )
        {
            System.out.println( "The answer = " +x );
        }
        else
        {
            System.out.println( "Invalid" );
        }
    }
}