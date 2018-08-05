import java.util.Scanner;
public class question6b
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int pin;
      int pincount = 1;
      
         
         System.out.print("PLease enter pin: ");
         pin = keyboardIn.nextInt();

      
      do{
      
          System.out.println("Wrong pin , try again");
         
            System.out.print("PLease enter pin: ");
            pin = keyboardIn.nextInt();
            
            pincount++;
         
                 
         }
         
         while(pin != 1234);
         
            System.out.print("Correct, number of attempts was "+pincount);
            
   }
}
