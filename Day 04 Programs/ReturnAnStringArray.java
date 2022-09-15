import java.util.*;
public class ReturnAnStringArray
{
    public static void main( String args[] )
    {
        List <String> li = new ArrayList<>();
        Scanner reader = new Scanner( System.in );
        int getNumber = reader.nextInt();
        for( int i = 1 ; i <= getNumber ; i++ )
        {
            if( i % 3 == 0 || i % 5 == 0 )
            {
                if( i % 3 == 0 && i % 5 == 0 )
                {
                    li.add( "FIZZBUZZ" );
                }
                else if( i % 3 == 0 )
                {
                    li.add( "FIZZ" );
                }
                else if( i % 5 == 0 )
                {
                    li.add( "BUZZ" );
                }
            }
            else
            {
                li.add( Integer.toString( i ) );
            }
        }
        System.out.println( li );
    }
}