import java.util.Scanner;
public class nestedloopA6
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         for(int i = 1 ; i <= 3 ; i++)
         {
            for(int j = 0 ; j <= 4 ; j++)
            {
               System.out.print(j+ " ");
            }
            System.out.println();
         }
   }
}