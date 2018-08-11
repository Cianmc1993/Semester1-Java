import java.util.Scanner;
public class nestedloopA7
   {
      public static void main(String [] args)
      {
         Scanner keyboardIn = new Scanner(System.in);
         
         for(int i = 1 ; i <= 12 ; i++)
         {
            for(int j = 1 ; j <= 12 ; j++)
            {
               System.out.println(i+"*"+j+"="+ (i*j) + " ");
            }
            System.out.println();
         }
   }
}