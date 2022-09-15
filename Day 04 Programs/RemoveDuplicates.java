import java.util.Scanner;
public class RemoveDuplicates
{
    public static void main ( String args[] ) 
    {
        try
        {
            int i, j;
            int x = 1;
            Scanner reader = new Scanner( System.in );
            System.out.println( "Enter number of elements in array : " );
            int getNumber = reader.nextInt();
            int arr[ ]=new int[ getNumber ];
            for( i = 0 ; i < getNumber ; i++ )
            {
                System.out.print( "Enter element " +(i + 1)+ " =");
                arr[ i ] = reader.nextInt();
            }
            for( i = 0 ; i < getNumber ; i++ )
            {
                if( arr[ i ] == 0 ) 
                {
                    x = 0;
                }
            }
            for( i= 0 ; i < getNumber ; i++ )
            {
                for( j = 0 ; j < i ; j++ )
                {
                    if( arr[ i ] == arr[ j ] )
                    {
                        arr[ i ] = 0;
                        arr[ j ] = 0;
                    }
                }
            }
            if( x == 0 )
            {
                System.out.print( " 0 " );
            }
            for( i = 0 ; i < getNumber ; i++ )
            {
                if( arr[ i ] != 0 )
                {
                    System.out.print( " " +arr[ i ] );
                }
            }
        }
        catch(Exception e)
        {
            System.out.println( "Invalid!" );
        }
    }
}