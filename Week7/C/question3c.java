import java.util.Scanner;
public class question3c
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int items;
      int counter = 1;
      double value = 0;
      double total = 0;
      double tendered;
      double owed;
     
      
      do{
      
         System.out.print("Please enter price of item"+counter+" : ");
         value = keyboardIn.nextDouble();
         
         total+=value;
         counter++;
        }
        while(value != 0);
      
        System.out.println("Total bill is "+total);
        System.out.print("How much money did you hand me? ");
        tendered = keyboardIn.nextDouble();
      
      while(tendered < total)
      {
         System.out.println("Another "+(total-tendered)+" is due");
         owed = keyboardIn.nextDouble();
                 
      }
      
         total = tendered - total;
         System.out.print("Your change is "+total);
         
   }
}
      