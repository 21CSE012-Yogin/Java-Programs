import java.util.Scanner;
public class ReversePalindrome
{
    public static void main( String args[] ) 
    {
        try
        {
            int z;
            Scanner reader = new Scanner( System.in );
            System.out.println( "Enter the number : " );
            int getNumber = reader.nextInt();
            int m = getNumber;
            int a = hell(m);
            while( a != m )
            {
                m = a + m;
                a = hell( m );
            }
            System.out.println( "Answer : " +a);
        }
        catch(Exception e)
        {
            System.out.println( "Invalid!" );
        }
    }
    public static int hell( int x )
    {
        int y=0;
        int reverse;
        int i=10;
        while(x>0)
        {
            reverse = x % 10;
            y = y * i;
            y = y + reverse;
            x = x / 10; 
        }   
        return y;
    }      
}