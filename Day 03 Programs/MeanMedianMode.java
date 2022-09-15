import java.util.*;
class MeanMedianMode
{
    public static void main( String args[] )
    {
        List<Integer>li = new ArrayList<>();
        Scanner reader = new Scanner( System.in );
        System.out.println("enter the number of elements");
        int getNumber=reader.nextInt();
        for(int i = 0 ; i < getNumber ; i++)
        {
            li.add(reader.nextInt());
        }
        int sum = li.stream().mapToInt( Integer::intValue ).sum();
        float getNumber1 = getNumber;
        float mean = sum / getNumber1;
        System.out.println(" Mean   = " +mean );
        int c1 = 0;
        int mode = 0;
        int median = 0;
        for(int i = 0 ; i < getNumber ; i++)
        {
            int c=Collections.frequency( li,li.get(i) );
            if( c > c1 )
            {
                c1 = c;
                mode = li.get(i);
            }
        }
        Collections.sort(li);
        if( getNumber%2 == 0 )
        {
            float median1 = ( li.get((getNumber/2)-1 ) + li.get( (getNumber/2)-1)+1 ) / 2;
            System.out.println(" Median = " +median1 );
        }
        else    
        {
            int mid = ( getNumber +1 )/2;
            median = li.get(mid-1);
            System.out.println(" Median = " +median );
        }
        System.out.println(" Mode   = " +mode );
    }
}