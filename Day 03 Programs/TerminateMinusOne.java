import java.util.Scanner;
public class TerminateMinusOne
{
    public static void main( String args[] ) 
    {
        try
        {
            Scanner reader = new Scanner( System.in );
            int v2 = 0;
            int l  =-1;
            double i1 =0;
            double i2 = 0;
            double u  = 0;
            double u1 = 0;
            double u2 = 1;
            double averagePositive;
            double averageNegative;
            while( v2 != l )
            {
                System.out.println( "Enter an number : ");
                v2 = reader.nextInt();
                if( v2 >= 0 )
                {
                    u1 = u1 + v2;
                    i1 = i1 + 1;
                }
                else
                {
                    u2 = u2 + v2;
                    i2 = i2 + 1;
                }
            }
            averageNegative = u2 / i2;
            averagePositive = u1 / i1;
            System.out.println("Total average of negative numbers : " +averageNegative);
            System.out.println("Total average of positve numbers  : " +averagePositive);
        }
        catch(Exception e)  
        {
            System.out.println("Invalid");
        }
    }
}