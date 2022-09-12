import java.util.Scanner;
class AverageMarks
{
     public static void main(String[]args)
     { 
          int phy,bio,java;
          System.out.print("phy:");
          Scanner sc=new Scanner(System.in);
          phy=sc.nextInt();
          System.out.print("bio:");
          Scanner sa=new Scanner(System.in);
          bio=sa.nextInt();
          System.out.print("java:");
          Scanner as=new Scanner(System.in);
          java=as.nextInt();
          int total=phy+bio+java;
          double avg=(total / 3);
          if((avg>=75)&&(avg<100))
          {
              System.out.println("grade A");
          }
          else if((avg>=60)&&(avg<75))
          { 
              System.out.println("grade B");
          }
          else
          {
             System.out.println("grade c");     
          }
          System.out.println("avg:"+avg);
     }
}