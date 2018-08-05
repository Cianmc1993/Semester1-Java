import java.util.Scanner;
public class question4c
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      char opt;
      int added;
      int one = 0;
      int two = 0;
      boolean valid = false;
      
      while(valid == false){
      
      System.out.println(" Calculation munu ");
      System.out.println("*******************");
      System.out.println("    A. Add       ");
      System.out.println("    S. Subtract   ");
      System.out.println("    Q. Quit       ");
      System.out.println("                  ");
      System.out.println("Enter choice  [A|S|Q]");
      
      opt = keyboardIn.next().charAt(0);
      
      if(opt == 'a' || opt == 'A' || opt == 's' || opt == 'S')
      {
         System.out.print("Enter number one: ");
         one = keyboardIn.nextInt();
         
         System.out.print("Enter number two: ");
         two = keyboardIn.nextInt();
      }
      
      if(opt == 'a' || opt == 'A')
      {
      added = one + two;
      System.out.println("The numbers added is "+added);
      }
      
      if(opt == 's' || opt == 'S')
      {
      added = one - two;
      System.out.println("Two numbers subtracted is "+added);
      }
      
      if(!(opt == 'A' || opt == 'a' || opt == 'S' || opt == 's' || opt == 'Q' || opt == 'q'))
      {
      System.out.println("Please learn how to read ya ejit. Enter another option." );
      }
      
      if(opt == 'q' || opt == 'Q')
      {
      valid = true;
      }
      }
      System.exit(0);
      
   }
}
      

      
      
      
      
      
