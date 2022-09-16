import java.util.*;
class Main
{
    public static void main( String args [ ] )
    {
        Scanner reader = new Scanner( System.in );
        int getNumber = reader.nextInt( );
        int count = 0;
        while(getNumber != 0)
        {
            if( getNumber % 2 == 0 )
            {
                getNumber = getNumber / 2;
                count++;
            }
            else
            {
                getNumber = getNumber - 1;
                count++;
            }
        }
        System.out.println( count );
    }
}