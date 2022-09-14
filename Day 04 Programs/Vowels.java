import java.util.Scanner;
public class Vowels 
{
	public static void main(String args[])
	{
      		int vCount = 0;
      		System.out.println("Enter a sentence : ");
      		Scanner reader = new Scanner(System.in);
      		String sentence = reader.nextLine();
		for (int i = 0 ; i < sentence.length() ; i++)
		{
         			char ch = sentence.charAt(i);
         			if(ch == 'a'|| 
			ch == 'e'|| 
			ch == 'i' ||
			ch == 'o' ||
			ch == 'u'||
			ch == ' ')
			{
            				vCount ++;
        			 }
      		}
      		System.out.println("Number of vowels in the given sentence is "+vCount);
   	}
}