import java.util.Scanner;
public class SkippingElements
{
    public static void main( String args[] )
    {
        int varM;
        int varN;
        int varK;
        int i, j;
        int b = -5;
        int m;
        int n;
        int t;
        Scanner reader = new Scanner( System.in );
        System.out.println( "Enter the values of starting range :  " );
        m = reader.nextInt();
        System.out.println( "Enter the values of ending range   :  " );
        n = reader.nextInt();
        System.out.println( "Enter the values to be skipped     :  " );
        varK = reader.nextInt();
        System.out.println( "The result is " );
        if( m != n )
        {
            if( n < m )
            {
                varM = n;
                varN = m;
            }
            else
            {
                varM = m;
                varN = n;
            }
            for( i = varM ; i <= varN ; i++)
            {
                System.out.println( i+ " ");
                i = i + varK;
            }
        }
        else
        {  
            System.out.println( "Zero" );
        }
    }
}
