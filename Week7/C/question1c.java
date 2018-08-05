import java.util.Scanner;
public class question1c
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int i;
      int j = 0;
      int total = 0;
      
       System.out.print("Enter an integer: ");
       i = keyboardIn.nextInt();

      
      do{
      total += i;
      
      System.out.print("Enter an integer: ");
      i = keyboardIn.nextInt();
      
      j++;
      }
      while(i != 0);
      
         System.out.print("The average of the integers entered is "+(total/j));
         
         
   }
}
      
      