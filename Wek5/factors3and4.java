import java.util.Scanner;

public class factors3and4
{ 
   public static void main(String [] args)

   { 
      Scanner keyboardIn = new Scanner(System.in);
   
      System.out.println("Please enter your number: ");
   
      int number = keyboardIn.nextInt();
   
      // testing if 3 and 7 are factors
      if(number%7==0 && number%3==0)
      {
      System.out.println("The number you have entered shares the factors 3 and 7 ");
      }
      // testing if 3 or 7 are factors
      if(number%7==0 || number%3==0)
      {
      System.out.println("The number you have entered shares the factor 3 and/or 7 ");
      }           
              
     
   }
}