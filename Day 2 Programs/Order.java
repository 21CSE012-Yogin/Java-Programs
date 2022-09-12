import java.util.Scanner;
public class Order
{
    public static void main(String[] args) 
    {
        int a;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        a = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter all the names:");
        for(int i = 0; i < a; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < a; i++) 
        {
            for (int j = i + 1; j < a; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("Names in Sorted Order:");
        for (int i = 0; i < a - 1; i++) 
        {
            System.out.print(names[i] + "\n");
        }
        System.out.print(names[a - 1]);
    }
}