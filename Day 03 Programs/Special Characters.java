import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class SpecialCharacters 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String userInput = sc.nextLine();
        sc.close();
        System.out.println("You entered: " + userInput);
        Pattern p = Pattern.compile("[ !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");
        Matcher m = p.matcher(userInput);
        int countOfSplChars = 0;
        while (m.find()) 
        {
            countOfSplChars += 1;
            System.out.println(userInput.charAt(m.start()));
        }
        System.out.println("Total special characters found:"+countOfSplChars);
    }
}