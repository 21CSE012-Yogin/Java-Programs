/* Write a program to generate 5 Random nos. between 1 to 100, and it should not follow with decimal point. */

public class Main
{
    public static void main(String[] args)
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.println((int)(Math.random()*100));
        }
    }
}
 
