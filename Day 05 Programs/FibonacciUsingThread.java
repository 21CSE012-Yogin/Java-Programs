import java.util.*;
class thread extends Thread
{
    public void run( )
    {
        try
        {
            Scanner reader = new Scanner( System.in );
            int a = 0;
            int b = 1;
            int getNumber = reader.nextInt();
            int c = a + b;
            System.out.println( a );
            System.out.println( b );
            for( int i = 0 ; i< getNumber - 2 ; i++ )
            {
                System.out.println( c );
                a = b;
                b = c;
                c = a + b;
            }
        }
        catch ( Exception e )
        {
            System.out.println( e.toString( ) );
        }
    }
}
class FibonacciUsingThread
{
    public static void main( String args[ ] )
    {
        thread ob = new thread( );
        ob.start( );
    }
}