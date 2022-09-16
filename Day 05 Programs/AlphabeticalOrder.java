import java.util.*;
class AlphabeticalOrder
{
    public static void main( String args[ ] )
    {
        Scanner reader = new Scanner( System.in );
        String str = reader.nextLine( );
        int getNumber = str.length( );
        char temp;
        char array[ ] = str.toCharArray( );
        for( int i = 0 ; i < getNumber ; i++ )
        {
            for( int j = 0 ; j < getNumber ; j++ )
            {
                if( array[ i ] > array[ j ] )
                {
                    temp = array [ i ];
                    array [ i ] = array [ j ];
                    array [ j ] = temp;
                }
            }
        }
        reader.close();
        String str1 = new String( array );
        System.out.println( str1 );
    }
}
