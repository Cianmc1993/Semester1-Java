import java.util.Scanner;

public class ascii2
{ 

   public static void main(String [] args)

   {
      Scanner keyboardIn = new Scanner(System.in);
   
   
      System.out.println("          AsciiToChar Menu            ");
      System.out.println("                                      ");
      System.out.println("    1. Convert Ascii to Character     ");
      System.out.println("    2. Convert Charachter to Ascii    ");
      System.out.println("                                      ");
      System.out.println("Please enter your choice:             ");
   
      int task = keyboardIn.nextInt();
   
      if( task == 1)
      {
            System.out.println("Please enter character to be tested: ");
            char tested = keyboardIn.next().charAt(0);
            System.out.println(tested + " has the ascii value of " + (int)tested);
      }
      else if ( task == 2)
      {
            System.out.println("Please enter ascii number to be tested: ");
            int tested2 = keyboardIn.nextInt();
            System.out.println(tested2 + " has the character value of " + (char)tested2);
      }

              
     
   }
}