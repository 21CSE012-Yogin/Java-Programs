import java.util.*;
class SumOfN
{
    public static void main( String args [ ] )
    {
        Scanner reader = new Scanner( System.in );
        int[ ] arr = new int[ 10 ];
        int getNumber = reader.nextInt( );
        try
        {
            int sum = 0;
            for( int i = 0 ; i < getNumber ; i++ )
            {
                arr[ i ]  = reader.nextInt( );
                sum = sum + arr [ i ];
            }
            System.out.println( sum );
        }
        catch( Exception e )
        {
            System.out.println( e.toString( ) );
        }
    }
}