import java.io.*;
import java.util.*;
public class CountOfVowelsAndConsonants
{  
	public static void main(String[] args) 
	{ 
		try
		{
         			System.out.println("Enter an String: ");
            			InputStreamReader sr=new InputStreamReader(System.in);
            			BufferedReader br=new BufferedReader(sr);
            			String str1 = br.readLine();
            			String c = " ";
            			String v = " ";
			int x = str1.length();
          			int i;
          			for(i = 0 ; i < x ; i++)
          			{
            				if((str1.charAt(i) == 'a')||
				(str1.charAt(i) == 'e')||
				(str1.charAt(i) == 'i')||
				(str1.charAt(i) == 'o')||
				(str1.charAt(i) == 'u')||
				(str1.charAt(i) == 'A')||
				(str1.charAt(i) == 'E')||
				(str1.charAt(i) == 'I')||
				(str1.charAt(i) == 'U'))
           	 			{
              					c =c + str1.charAt(i) +' ';
            				}
            				else
            				{
              					v = v + str1.charAt(i)+' ';  
            				}
          			}
        			System.out.println("Consonants-: "+v); 	
			System.out.println("Vowels-: "+c); 
		}
       		catch (Exception e)
          		{
			System.out.println(e);
	      	}	     
    	}  
} 