import java.util.Scanner;
public class PrimeOrComposite
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any number");
          int input = sc.nextInt();
          int i=2;
          while(input>0)
          {
               if(input%i==0)
                  break;
                  i++;
           }
           if(input == i)
              System.out.println("Number is prime"); 
           else
              System.out.println("Number is not prime");
       }
}