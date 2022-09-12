public class Pattern 
{
    public static void main(String[] args) 
    {
       int r = 6, coefi = 1;
       for(int i = 0; i < r; i++) 
       {
         for(int space = 1; space < r - i; ++space) 
         {
            System.out.print("  ");
         }
         for(int j = 0; j <= i; j++) 
         {
            if (j == 0 || i == 0)
               coefi = 1;
            else
               coefi = coefi * (i - j + 1) / j;
            System.out.printf("%4d", coefi);
          }
        System.out.println();
       }
    }
}