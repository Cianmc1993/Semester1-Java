import java.util.Scanner;
public class busTickets
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      int totalCount = 0 ;
      double total = 0;
      int babyCount = 0 , teenCount = 0 , middleCount = 0 , oapCount = 0;
      
      do{
      
         System.out.print("Please enter age: ");
         age = keyboardIn.nextInt();
         
         if(age < 4 && age > 0)
         {
            total = total + 0.0 ;
            babyCount++ ;
            totalCount++ ;
         }
         
         else if(age < 18 && age > 3)
         {
            total = total + 4.0 ;
            teenCount++ ;
            totalCount++ ;
         }
         
         else if(age > 65)
         {
            total = total + 3.5 ;
            oapCount++ ;
            totalCount++ ;
         }
         
         else if(age > 18 && age < 65)
         {
            total = total + 6.0 ;
            middleCount++ ;
            totalCount++ ;
         }
        }
          
         
             while(age != 0);
             
             System.out.println("Total number of tickets sold is "+totalCount);
             System.out.println("Total number of baby tickets sold is "+babyCount);
             System.out.println("Total number of teenage tickets sold is "+teenCount);
             System.out.println("Total number of middle tickets sold is "+middleCount);
             System.out.println("Total number of oap tickets sold is "+oapCount);
             System.out.println("Total price is "+total);
             
   }
}