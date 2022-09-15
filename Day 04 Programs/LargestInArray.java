import java.util.Scanner;
public class LargestInArray
{
    public static void main( String args[] )
    {
        try
        {
            int i;
            int x;
            Scanner reader = new Scanner( System.in );
            System.out.println( "Enter no of elements in array : " );
            int getNumber = reader.nextInt();
            int arr[ ]=new int[ getNumber ];
            for( i = 0 ; i < getNumber ; i++ )
            {
                System.out.print( "Enter element " +(i +1 )+ " = " );
                arr[ i ] = reader.nextInt();
            }
            x = arr[ 0 ];
            for( i = 1 ;i < getNumber ; i++ )
            {
                if( x < arr[ i ] )
                {
                    x = arr[ i ];
                }
            }
            System.out.println( "The largest number is = " +x );
        }
        catch(Exception e)
        {
            System.out.println("Invalid!");
        }
    }
}