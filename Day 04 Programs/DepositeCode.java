import java.util.*;
abstract class DepositeCode
{
    public abstract void accountNumber( int accNumber    );
    public abstract void depositerName( String holderName);
    public abstract void accountType  ( String str       );
    public abstract void totalAmount  ( int amount       );
}
public class cust extends customer
{
    public void accountNumber( int accNumber ) 
    {
        System.out.println( "Account number : " +accNumber );
    }
    public void depositerName( String holderName ) 
    {
        System.out.println( "Depositer name : " +holderName);
    }
    public void accountType(String str) 
    {
        if( str.charAt(0) == 's' )
        {
            System.out.println( "It is a Saving account" );
        }
        else if( str.charAt(0) == 'c' )   
        {
            System.out.println( "It is a Current account" );
        }
        else
        {
            System.out.println( "The type of account you have entered is Incorrect!\nTry Again" );
        }
    }
    public void totalAmount( int amount )  
    {
        amount = amount + 10000;
        System.out.println( "Total amount : " +amount );
    }
}
class inter
{
    public static void main( String args[] )
    {
        Scanner reader = new Scanner( System.in );
        cust ob = new cust();
        int amount,accNumber;
        String holderName;
        String str;
        try
        {
            System.out.println( "Enter the account number         : " );
            accNumber = reader.nextInt();
            System.out.println( "Enter the account holder name    : " );
            holderName = reader.next();
            System.out.println( "Enter\nc -> Current \ns -> Savings " );
            System.out.println( "Enter the type of Account        : " );
            str = reader.next();
            System.out.println( "Enter the amount to be deposited :  ");
            amount = reader.nextInt();
            ob.accountNumber( accNumber );
            ob.depositerName( holderName );
            ob.accountType( str );
            ob.totalAmount( amount );
        }
        catch (Exception e) 
        {
            System.out.println( "You have entered the wrong data!\nPay attention while entering the detials" );
        }
    }
}