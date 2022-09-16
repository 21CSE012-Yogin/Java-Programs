import java.util.Scanner;
public class CompositeInArray 
{
    public static void main( String args[ ] ) 
    {
        Scanner reader = new Scanner( System.in );
        System.out.println( "Enter number of elements in the array : " );
        int getNumber = reader.nextInt( );
        int array[ ] = new int[ getNumber ];
        System.out.println( "Enter the elements of the array one by one : " );
        int x;
        int k;
        int lk = 0;
        for( int i = 0; i < getNumber ; i++ )
        {
            array[ i ] = reader.nextInt( );
        }
        for( int i = 0 ; i < getNumber ; i++ )
        {
            k = 0;
            for(int j = 2 ; j < array[ i ] ; j++ )
            {
                if ( array [ i ] % j == 0 )
                {
                    k = k + 1;
                }
            }
            if ( k > 0 )
            {
                lk = lk + 1;
            }
        }
        System.out.println( "Total number of composite numbers are : " +lk);
    }
}