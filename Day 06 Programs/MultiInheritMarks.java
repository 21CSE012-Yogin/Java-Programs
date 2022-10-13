/*  To write a java program that implements the multilevel inheritance. Define a class 
    student and Declare the variable roll no, marks. In the class student get the roll no of 
    students and Derive the class test from student class & declare the method get marks()
    and Derive the class result from class test.
*/

import java.util.*;
class Main 
{   
    public int roll()
    {   
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the roll number : ");
        int roll_no = a.nextInt();
        a.close();
        return roll_no;
    }
}
class test extends Main
{
    public int integer_marks()
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the no of sub : ");
        int n = a.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the marks : ");
        int sum = 0;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = a.nextInt();
            sum = sum + arr[i];
        }
        a.close();
        return sum;
    }
}
class result extends test
{
    public void result1()
    {
        test ob = new test();
        int sum = ob.integer_marks();
        System.out.println("Total marks: "+sum);
        System.out.println("Rolll no   : "+ob.roll());
    }
}
class inheritance
{   
    public static void main(String[] args)
    {
        result ob = new result();
        ob.result1();
    }
}
