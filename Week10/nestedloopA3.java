import java.util.Scanner;
public class nestedloopA3
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         for(int hours = 0 ; hours < 24 ; hours++)
         {
            for(int mins = 0 ; mins <60 ; mins++)
            {
               System.out.print(hours+":"+mins+ " ");
            }
            System.out.println();
         }
   }
}