import java.util.Scanner;

public class totalInterest
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double interest;
      double total = 0;
      
      for(int i = 1 ; i <=15 ; i++)
      {
        total = total + (20 * .10);
        System.out.println("total interest after year "+i+" is "+total);
      }
    
         System.out.print("total interest after 15 years is "+total);
   }
}
         
         