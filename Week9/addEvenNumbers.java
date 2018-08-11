import java.util.Scanner;

public class addEvenNumbers
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int total = 0;
      
      for(int i = 1 ; i <= 100 ; i++)
      {
         if( i % 2 == 0)
         
         total = total + i ;
         
      }
         System.out.print("The sum of all the even numbers between 1-100 is "+total);
   }
}  
      