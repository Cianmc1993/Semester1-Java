import java.util.Scanner;
public class accountBal
{
      public static void main(String [] args)
   {
      Scanner keyboardIn=new Scanner(System.in);
      
      double balance;
      
      System.out.print("Enter your account balance: ");
      balance = keyboardIn.nextDouble();
      
      if(balance>=0)
      {
         System.out.print("Your account is in credit by "+balance+"euro");
      }
      
      else
      {
         System.out.print("You are overdrawn by "+balance+"euro");
      }
      
   }
}
      