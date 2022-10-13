/* Write a program to print number of factors and to print nth factor of the given number */

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        a.close();
        List<Integer>li=new ArrayList<>();
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                li.add(i);
            }
        }
        System.out.println("Number of factors    : "+li.size());
        System.out.println("Enter the nth factor : ");
        int n1=a.nextInt();
        System.out.println(li.get(n1 - 1));
    }
}