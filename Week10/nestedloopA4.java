import java.util.Scanner;
public class nestedloopA4
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         int input ;
         
         System.out.print("How many stars do you want to see? ");
         input = keyboardIn.nextInt();

         
         for(int i = 1 ; i <= input ; i++)
         {
            for(int j = 1 ; j <= input ; j++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
   }
}