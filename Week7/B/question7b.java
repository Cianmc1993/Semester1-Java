import java.util.Scanner;
public class question7b
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int pin;
      int pincount = 1;
      boolean valid = false ;
      
         
         System.out.print("PLease enter pin: ");
         pin = keyboardIn.nextInt();
         valid =(pin==1234?true:false);
      
      do{
         
            System.out.print("PLease enter pin: ");
            pin = keyboardIn.nextInt();
            valid =(pin==1234?true:false);
            
            pincount++;
         
                 
         }
         
         while(pin != 1234 && pincount < 3);
         
            System.out.println("Number of attempts was "+pincount);
            if(valid == true)
            System.out.println("Pin is correct");
            else
            System.out.println("You have ran out of attempts");
            
   }
}
