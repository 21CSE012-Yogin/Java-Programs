import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int firstDenom;
        int countFirst;
        int secondDemon;
        int countSecond;
        int thirdDenom;
        int countThird;
        int fourthDenom;
        int countFourth;
        int totalBalanceATM;
        System.out.println("Enter the 1st Denomination:");
        firstDenom = reader.nextInt();
        System.out.println("Enter the 1st Denomination number of notes");
        countFirst = reader.nextInt();
        System.out.println("Enter the 2nd Denomination:");
        secondDemon = reader.nextInt();
        System.out.println("Enter the 2nd Denomination number of notes");
        countSecond = reader.nextInt();
        System.out.println("Enter the 3rd Denomination:");
        thirdDenom = reader.nextInt();
        System.out.println("Enter the 3rd Denomination number of notes");
        countThird = reader.nextInt();
        System.out.println("Enter the 4th Denomination:");
        fourthDenom = reader.nextInt();
        System.out.println("Enter the 4th Denomination number of notes");
        countFourth = reader.nextInt();
        totalBalanceATM = ( (firstDenom*countFirst) + (secondDemon*countSecond) + 
                            (thirdDenom*countThird) + (fourthDenom*countFourth) );
        System.out.println( "Total Available Balance in ATM : " +totalBalanceATM );
    }
}