import java.util.*;
class LengthOfTheLastWord
{
    public static void main( String args[ ] )
    {
        Scanner reader = new Scanner( System.in );
        String str = reader.nextLine( );
        String arr[ ] = str.split( " " );
        System.out.println( arr[ arr.length - 1 ] );
        System.out.println( arr[ arr.length - 1 ].length( ) );
    }
}