import java.util.Scanner;
public class question12a
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int counter = 1 , total = 0;
      int n;
      
      System.out.print("Please enter an integer: ");
      n = keyboardIn.nextInt();
      
      while(counter <= n)
      {
         total += counter;
         counter++;
      }
      
         System.out.print("The sum of 1-"+n+" is "+total);
   }
}