import java.util.Scanner;
public class nestedloopA2
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         int input ;
         
         System.out.print("How many stars do you want to see? ");
         input = keyboardIn.nextInt();
         
         for(int i = 1 ; i <= input ; i++)
         {
            System.out.print("*");
         }
   }
}