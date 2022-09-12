import java.util.Scanner;
class Reverse
{
       public static void main(String[]args)
       {
             int i,a;
             String s;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the string: ");
             s=sc.nextLine();
             char str[]=s.toCharArray();
             a=str.length;
             System.out.println("The reversed string is ");
             for(i=a-1;i>=0;i--)
             {
                 System.out.print(str[i]);
             }
       }
}