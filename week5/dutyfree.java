import java.util.Scanner;
public class dutyfree
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double total=0;
      
      System.out.print("The total price for purchases is: ");
      double price = keyboardIn.nextDouble();
      
      System.out.print("Are you travelling to an EU destination?(Y) or (N): ");
      char destination = keyboardIn.next().charAt(0);
      
      if(destination == 'n' || destination == 'N')total = price;
      
      else if(destination == 'y' || destination == 'N')total = price - (price*.21);
      
      System.out.print("Your total price is "+total+" euro");

   }
}