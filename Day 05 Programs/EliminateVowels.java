import java.util.*;
class EliminateVowels
{
    public static void main( String args[ ] )
    {
        Scanner reader = new Scanner( System.in );
        String str = new String( );
        String str1 = new String( );
        str1 = "";
        str = reader.nextLine( );
        reader.close( );
        for(int i = 0 ; i < str.length( ) ; i++ )
        {
            if( Character.toLowerCase( str.charAt( i ) ) == 'a'||
            Character.toLowerCase( str.charAt( i ) ) == 'e'||
            Character.toLowerCase( str.charAt( i ) ) == 'i'||
            Character.toLowerCase( str.charAt( i ) ) == 'o'||
            Character.toLowerCase( str.charAt( i ) ) == 'u')
            {
                
            }
            else
            {
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
