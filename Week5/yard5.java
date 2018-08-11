import java.util.Scanner;
public class yard5
{ 

   public static void main(String [] args)

   {
      Scanner keyboardIn = new Scanner(System.in);
   
      System.out.println("Please enter your number: ");
      double inch = keyboardIn.nextDouble();
   
      double foot = inch/12;
      double yard = foot/3;
   
      System.out.println(inch + " inches  is equivalent to " + yard + " yard");
  
   }
}