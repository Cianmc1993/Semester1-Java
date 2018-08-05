import java.util.Scanner;
public class question4b
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int i;
      int poscounter = 0;
      int negcounter = 0;
      
      do{
         System.out.print("Enter an integer: ");
         i = keyboardIn.nextInt();
         
         if(i >= 1)
         {
         poscounter++;
         }
         
         else if(i < 0)
         {
         negcounter++;
         }
        }
        
           while( i != 0 );
           {
            System.out.println("Positive count is "+poscounter);
            System.out.println("Negative count is "+negcounter);

           }
  
   }
}
