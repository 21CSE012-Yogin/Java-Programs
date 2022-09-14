import java.util.Scanner;
public class Fibonacci
{
	public  static void main(String[] args)
    	{
		try
		{
        			Scanner reader = new Scanner(System.in);
        			System.out.println("Enter an number : ");
        			int number = reader.nextInt();
        			int a = 0;
			int b = 1;
			int c = 0;
			int y = number - 2;
        			System.out.print(a+" ");
        			System.out.print(b+" ");
        			while(y > 0)
        			{
            				c = a + b;
            				System.out.print(c+" ");
            				a = b;
            				b = c;
            				y = y - 1;
        			}	
    		}
        		catch(Exception e)
       		{
         			System.out.println("Invalid");   
        		}
	}
}