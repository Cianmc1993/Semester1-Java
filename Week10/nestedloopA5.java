import java.util.Scanner;
public class nestedloopA5
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         char input ;
         int row, column;
         
         System.out.print("Please enter a character: ");
         input = keyboardIn.next().charAt(0);
         
         System.out.print("Please enter a number of rows: ");
         row = keyboardIn.nextInt();
         
         System.out.print("Please enter a number of columns: ");
         column = keyboardIn.nextInt();

         
         for(int i = 1 ; i <= row  ; i++)
         {
            for(int j = 1 ; j <= column ; j++)
            {
               System.out.print(input);
            }
            System.out.println();
         }
   }
} 