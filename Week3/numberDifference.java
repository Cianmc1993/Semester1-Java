import java.util.Scanner;
public class numberDifference
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int num1 , num2 , difference ;
      
      System.out.print("Enter a number : ");
      num1 = keyboardIn.nextInt();
      
      System.out.print("Now enter a larger number : ");
      num2 = keyboardIn.nextInt();
      
      difference = num2 - num1 ;
      
       System.out.print("The difference between the two numbers is"+difference);
   }
}


      
      