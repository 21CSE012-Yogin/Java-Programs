import java.util.*;
public class LcmAndGcd
{
   public static void main(String args[])
   {
      int a,b;
      int gcd,lcm,rem,num,denom;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      a=sc.nextInt(); 
      b=sc.nextInt();
      if (a>b)
      {	
         num=a;
         denom=b;
       }
       else
       {
           num=b;
           denom=a;
        }
        rem=num%denom;
        while(rem!=0)
        {
             num=denom;
             denom=rem;
             rem=num%denom;
         }
         gcd = denom;
         lcm = a*b/gcd;
         System.out.println("GCD of "+a+" and "+b+" = "+gcd);
         System.out.println("LCM of "+a+" and "+b+" = "+lcm);
     }
}