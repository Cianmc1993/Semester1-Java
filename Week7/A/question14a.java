import java.util.Scanner;
public class question14a
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int i;
      int j;
      int k;
      
      System.out.print("Enter lotto number 1: ");
      i = keyboardIn.nextInt();

      System.out.print("Enter lotto number 2: ");
      j = keyboardIn.nextInt();
      
      System.out.print("Enter lotto number 3: ");
      k = keyboardIn.nextInt();
      
      System.out.print("Would you like to choose 3 different numbers (Y) for yes (N) for no: ");
      char opt = keyboardIn.next().charAt(0);
      
      while(opt == 'y' || opt == 'Y')
      {
         System.out.print("Enter lotto number 1: ");
         i = keyboardIn.nextInt();
      
         System.out.print("Enter lotto number 2: ");
         j = keyboardIn.nextInt();
         
         System.out.print("Enter lotto number 3: ");
         k = keyboardIn.nextInt();
         
         System.out.print("Would you like to choose 3 different numbers? (Y) or (N): ");
         opt = keyboardIn.next().charAt(0);
      }
      
         System.out.print("Thank you");
         
   }
}

         
      

      
