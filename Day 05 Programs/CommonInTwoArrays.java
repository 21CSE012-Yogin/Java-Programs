import java.util.*;
class CommonInTwoArrays
{
    public static void main( String args[ ] )
    {
        Scanner reader = new Scanner ( System.in );
        System.out.println( "Enter the number of element in first array : " );
        int firstArray = reader.nextInt( );
        int[ ] array1 = new int[ firstArray ];
        System.out.println( "Enter the number of element in second array : " );
        int secondArray = reader.nextInt( );
        int[ ] array2 = new int[ secondArray ];
        for( int i = 0 ; i < firstArray ; i++ )
        {
            array1[ i ] = reader.nextInt( );
        }
        for( int i = 0 ; i < secondArray ; i++ )
        {
            array2[ i ] = reader.nextInt( );
        }
        List <Integer> li = new ArrayList<>( );
        for( int i = 0 ; i < firstArray ; i++ )
        {
            for( int j = 0 ; j < secondArray ; j++ )
            {
                if( array1[ i ] == array2 [ j ] )
                {
                    li.add( array1[ i ] );
                    break;
                }
            }
        }
        HashSet <Integer> set = new HashSet<>( li) ;
        System.out.println( set );
    }
}