import java.util.Scanner;
public class question13a
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
       int result;
      
       System.out.print("Enter result: ");
       result = keyboardIn.nextInt();
      
      while(result < 0 || result > 100)
      {
         System.out.println("Invalid");
         
          System.out.print("Enter result: ");
          result = keyboardIn.nextInt();
      }
          
            System.out.print("Thank you");
         

      
           
   }
}
      
            

         