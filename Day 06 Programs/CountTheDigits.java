/* To write a java program that counts the number of digit of the given number and catches
   the exception if an alphabet is entered instead of a number.
*/

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        try
        {
            int getNumber = a.nextInt();
            int c = 0;
            while(getNumber != 0)
            {
                getNumber = getNumber / 10;
                c++;
            }
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
