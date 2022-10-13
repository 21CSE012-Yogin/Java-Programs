/* You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's 
   (representing civilians). The soldiers are positioned in front of the civilians. That is, all 
   the 1's will appear to the left of all the 0's in each row.
   A row i is weaker than a row j if one of the following is true:
   The number of soldiers in row i is less than the number of soldiers in row j.
   Both rows have the same number of soldiers and i< j. Return the indices of the k weakest 
   rows in the matrix ordered from weakest to strongest.
*/

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = a.nextInt();
        System.out.println("enter no of col");
        int col = a.nextInt();
        int arr[][] = new int[row][col];
        int arr1[] = new int[row];
        int arr2[] = new int[row];
        for(int i = 0; i < row ; i++)
        {
            int c = 0;
            for(int j = 0 ; j < col ; j++)
            {
                arr[i][j] = a.nextInt();
                if(arr[i][j] == 1)
                {
                    c++;
                }
            }
            arr1[i] = c;
            arr2[i] = c;
        }
        Arrays.sort(arr2);
        System.out.println("no of least elemnt index you want");
        int index = a.nextInt();
        List<Integer> li = new ArrayList<>();
        for(int i : arr2)
        {
            for(int j = 0 ; j < row ; j++)
            {
                if(i == arr1[j])
                {
                    li.add(j);
                }
            }
        }
        for(int i = 0 ; i < index ; i++)
        {
            System.out.print(li.get(i)+" ");
        }
    }
}
