import java.util.Scanner;
public class question3b
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int i;
      int counter = -1;
      
      do{
         System.out.print("Enter an integer: ");
         i = keyboardIn.nextInt();
         
         counter++;
         
        }
        
        while( i != 0 );
        {
         System.out.print("Thank you , total is "+counter);
        }
  
   }
}
