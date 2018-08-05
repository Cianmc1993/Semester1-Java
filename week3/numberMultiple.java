import java.util.Scanner;
public class numberMultiple
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int num1 , num2 ;
      
      System.out.print("Enter a number : ");
      num1 = keyboardIn.nextInt();
      
      System.out.print("Enter a second larger number to see if it is a multiple of the first : ");
      num2 = keyboardIn.nextInt();
      
      
      if( num2 % num1 == 0 )
      {
         System.out.print("Number is a multiple");
      }
      else
      {
         System.out.print("Number is not a multiple");
      }

   }
}
         
      
      