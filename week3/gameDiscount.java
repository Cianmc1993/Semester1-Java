import java.util.Scanner ;
public class gameDiscount
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      System.out.print("Enter price of first game: ");
      double game1 = keyboardIn.nextDouble();
      
      System.out.print("Enter price of second game: ");
      double game2 = keyboardIn.nextDouble();
      
      double total = game1 + game2 ;
      double disc ;
      if( total > 50.0 )
      {
         disc = total * .20 ;
         System.out.print("Total price before discount applied is "+ total +" euro . Discount is "+disc+ " euro and total price with discount applied is "+ (total-disc)+" euro");
      }
      else 
      {
         disc = total * .10 ;
         System.out.print("Total price before discount applied is "+ total +" euro , Discount is "+disc+" euro and total price with discount applied is "+ (total-disc)+" euro");
      }
   }
}        
               
      
      
      
      
      
      