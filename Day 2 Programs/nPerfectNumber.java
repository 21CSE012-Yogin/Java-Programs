import java.util.Scanner;
public class nPerfectNumber
{
    public static void main( String args[] ) 
    {
        Scanner reader = new Scanner( System.in );
        System.out.println( "Enter the number of perfect numbers you want print : " );
        try
        {
            int a = reader.nextInt();
            int i, j;
            int x = 0;
            if( a == 0 )
            {
                System.out.println( "The result is : 0 ");
            }
            else if( a > 0 )
            {
                int b = 0;
                for(j = 2 ; j < 100000000 ; j++)
                {
                    if( b < a )
                        x = 1;
                    for( i = 2 ; i < j ; i++)
                    {
                        if( j % i == 0 ) 
                        {
                            x = x + i;
                        }
                    }
                    if( x == j )
                    {
                        System.out.print( "," +j);
                        b = b + 1;
                    }
                }
            }
            else
            {
                System.out.println( "Invalid!" );
            }
        }
        catch(Exception e)
        {
            System.out.println( "Invalid!" );
        }
    }
}
