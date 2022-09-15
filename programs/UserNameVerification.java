import java.util.Scanner;
class UserNameVerification
{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the user name : ");
        String str1 = reader.nextLine();
        System.out.println("Reenter the user name : ");
        String str2 = reader.nextLine();
        if(str1.equals(str2))
        {
            System.out.println(" User name is valid ");
        }
        else
        {
            System.out.println(" User name is Invalid! ");
        }
    }
}