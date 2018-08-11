import java.util.Scanner;
public class question10a
{
   public static void main(String [] args)
   {
      int counter = 10 , total = 0;
      
      while(counter <= 100)
      {
         total += counter;
         System.out.println(counter);
         counter++;
         
      }
         System.out.print("The sum of 1-100 is "+total);
   }
}
      
      
