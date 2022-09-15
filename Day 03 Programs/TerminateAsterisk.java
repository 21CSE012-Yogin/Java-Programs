import java.util.*;
public class TerminateAsterisk
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner( System.in );
        String string = " ";
        int string1 = 0;
        int string2 = 0;
        int string3 = 0;
        while( string.charAt(0) != '*' )
        {
            System.out.println( "Enter any character : " );
            string =reader.next();
            if( Character.isUpperCase(string.charAt(0)) )
            {
                string1++;
            }
            else if( Character.isLowerCase(string.charAt(0)) )
            {
                string2++;
            }
            else if( Character.isDigit(string.charAt(0)) )
            {
                string3++;
            }
        }
        System.out.println( "Total number of Upper case = " +string1);
        System.out.println( "Total number of Lower case = " +string2);
        System.out.println( "Total number of Digits     = " +string3);
    }
}