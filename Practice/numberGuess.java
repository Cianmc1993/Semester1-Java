import java.util.Scanner;
import java.util.Random;

public class numberGuess
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Random randomNum = new Random();
      
      int randomNum1 = randomNum.nextInt(12)+1;
      int randomNum2 = randomNum.nextInt(12)+1;
      int answer = randomNum1 * randomNum2;
      int guess;
       
          do{  
          System.out.print("What is "+randomNum1+" * "+randomNum2+" ? ");
          guess = keyboardIn.nextInt();
          
          if(guess != answer)
          {
          System.out.println("Incorrect , please try again");
          }
         }
                   
          while(guess != answer);
          
            System.out.print("Correct");
       
   }
}
               
               
               
               
               
            
            
         
            
      
      
      