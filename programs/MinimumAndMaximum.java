import java.util.Scanner;
public class MinimumAndMaximum 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int getNumber = in.nextInt();
        int[] array = new int[getNumber];
        for(int i = 0 ; i < getNumber ; i++) 
        {
            array[i] = in.nextInt();
        }
        int max = array[0];
        for (int j = 0 ; j < array.length ; j++)
        {
            if (array[j] > max)
                max = array[j];
        }
        System.out.println(" Maximum = " +max);
        int min = array[0];
        for (int k = 0; k < array.length ; k++)
        {
            if (array[k] < min)
                min = array[k];
        }
        System.out.println(" Minimum = " +min);
        System.out.println(" Sum of Maximum & Minimum     =" + " " +(max+min));
        System.out.println(" Difference between Min & Max =" + " " +(max-min));
    }
}