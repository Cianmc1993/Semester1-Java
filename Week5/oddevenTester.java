import java.util.Scanner;
 
   public class oddevenTester
{ 
 
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
 
      int number;
  
   
   
      System.out.print("Please enter your number: ");
      number = keyboardIn.nextInt();
      
      if (number %2 == 0)
      {
         System.out.print("Your number is even");
      }
      
      else
      {
         System.out.print("Your number is odd");
      }
   }
}
