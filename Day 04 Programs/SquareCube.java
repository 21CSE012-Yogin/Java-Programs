import java.util.Scanner;
import java.lang.*;
public class SquareCube
{
	public static void main(String args[])
    	{
        		int getNumber;
		int b;
		int c; 	
		Scanner reader = new Scanner(System.in);
 		System.out.print("Enter The Number : ");
        		getNumber = reader.nextInt();
 		b = getNumber*getNumber;
		c = getNumber*getNumber*getNumber;
		System.out.println("\nOutput is = "+ b +" ,"+ c +"\n\n"); 
 	}
}