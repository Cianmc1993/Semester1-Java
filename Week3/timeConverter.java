import java.util.Scanner;
public class timeConverter
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
    
    int input;
          
      System.out.print("Enter your time in seconds: ");
      input = keyboardIn.nextInt();
      
      int minutes = input/60 ;
      int seconds = input % 60 ;
      int hours = minutes/60 ;
      int returnMinutes = minutes%60 ;
      
      System.out.print("Your time converted is " + hours + " hours "+ returnMinutes + " minutes and " + seconds + " seconds");
      
   }
} 