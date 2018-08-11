import java.util.Scanner;
 
   public class numberTester1
{ 
 
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
 
      double number;
  
   
   
      System.out.print("Please enter your number: ");
      number = keyboardIn.nextDouble(); 
    
       
     if(number >0)
     
     {
      
      System.out.println("Number is positive");
     } 
      
    else if(number < 0)
     
     {
      
      System.out.println("Number is negative");
     }
      
    else
     
     {
      
      System.out.println("Number is 0");
     }
     
         
      
   }
}