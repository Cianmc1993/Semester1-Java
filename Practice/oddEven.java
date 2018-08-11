import java.util.Scanner;
public class oddEven
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int num;
      
      System.out.print("Please enter a number: ");
      num = keyboardIn.nextInt();
      
      if(num % 2 == 0)
      {
         System.out.print("Your number is even");
      }
      else if(num == 0)
      {
         System.out.print("Your number is neutral");
      }
      else{
         System.out.print("Your number is odd");
       }
         

   }
}