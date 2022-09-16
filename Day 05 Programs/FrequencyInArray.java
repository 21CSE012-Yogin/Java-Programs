import java.util.Scanner;
public class FrequencyInArray 
{
    public static void main( String args [ ] ) 
    {
        Scanner reader = new Scanner( System.in );
        System.out.println( "Enter number of elements in the array : " );
        int getNumber = reader.nextInt( );
        int array[ ][ ] = new int[ getNumber ][ 2 ];
        System.out.println( "Enter the elements of the array       : " );
        for( int i = 0 ; i < getNumber ; i++ ) 
        {
            array[ i ][ 0 ] = reader.nextInt();
        }
        for( int i = 0 ; i < getNumber ; i++ )
        {
            array[ i ] [ 1 ] = 1;
        }
        for( int i = 0 ; i < getNumber ;  i++ )
        {
            for( int j = i + 1 ; j < getNumber ; j++ )
            {
                if( array[ i ] [ 0 ] == array[ j ] [ 0 ] )
                {
                    array[ j ] [ 0 ] = -1;
                    array[ i ] [ 1 ] =array[ i ] [ 1 ] + 1;
                }
            }
        }
        System.out.println( "The output table is = " );
        System.out.println( "Element | Frequency" );
        System.out.println( "---------------------" );
        for(int  i = 0 ; i < getNumber ; i++ )
        {
            if(array[ i ] [ 0 ] != -1 )
            {
                System.out.println(" " +array[ i ] [ 0 ]+ " | " +array[ i ] [ 1 ] );
            }
        }
    }
}