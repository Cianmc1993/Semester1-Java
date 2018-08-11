import java.util.Scanner;

public class tempeture
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int total= 0;
      
      for(int i = 1; i <= 7; i++)
      {
         System.out.print("Please enter the tempeture for day "+i+" : ");
         int tempeture = keyboardIn.nextInt();
         
         total += tempeture;
      }
         int average = total / 7;

         System.out.print("The average tempeture for the week is "+average);
         
   }
}
      